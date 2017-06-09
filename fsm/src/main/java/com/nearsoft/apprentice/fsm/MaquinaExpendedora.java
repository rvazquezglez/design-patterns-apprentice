package com.nearsoft.apprentice.fsm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;

import static com.nearsoft.apprentice.fsm.Entrada.*;
import static com.nearsoft.apprentice.fsm.MaquinaExpendedora.DuracionDeEstado.TRANSITORIO;

/**
 * Categorias para los datos de entrada
 */
enum Categoria {
    DINERO(TOSTON, PESO, DOS_PESOS, CINCO_PESOS, DIEZ_PESOS),
    SELECCION(BOLSA_DE_PAPAS, CHESCO, PAQUETE_DE_GALLETAS, BOLSA_DE_CACAHUATES),
    DETENER_TRANSACCION(ABORTAR_TRANSACCION),
    APAGAR(DETENER);

    private Entrada[] valores;

    Categoria(Entrada... tipos) {
        valores = tipos;
    }

    private static EnumMap<Entrada, Categoria> categorias = new EnumMap<>(Entrada.class);

    static {
        for (Categoria categoria : Categoria.class.getEnumConstants()) {
            for (Entrada tipo : categoria.valores) {
                categorias.put(tipo, categoria);
            }
        }
    }

    /**
     * Obtiene la categoria para los datos de entrada
     * @param entrada dato de entrada
     * @return categoria a la que pertenece
     */
    public static Categoria clasificar(Entrada entrada) {
        return categorias.get(entrada);
    }
}

public class MaquinaExpendedora {
    // Estados iniciales
    private static Estado estado = Estado.DETENIDO;
    private static double monto = 0;
    private static Entrada seleccion = null;

    private static Logger LOGGER = LoggerFactory.getLogger(MaquinaExpendedora.class);

    enum DuracionDeEstado {TRANSITORIO}

    enum Estado {
        DETENIDO {
            @Override
            void siguiente(Entrada entrada) {
                switch (Categoria.clasificar(entrada)) {
                    case DINERO:
                        monto += entrada.monto();
                        estado = AGREGANDO_DINERO;
                        break;
                    case APAGAR:
                        estado = APAGANDO;
                    default:
                }
            }
        },
        AGREGANDO_DINERO {
            @Override
            void siguiente(Entrada entrada) {
                switch (Categoria.clasificar(entrada)) {
                    case DINERO:
                        monto += entrada.monto();
                        break;
                    case SELECCION:
                        seleccion = entrada;
                        if (monto < seleccion.monto()) {
                            LOGGER.info("Dinero insuficiente para {}", seleccion);
                        } else {
                            estado = ENTREGANDO_PRODUCTO;
                        }
                        break;
                    case DETENER_TRANSACCION:
                        estado = ENTREGANDO_CAMBIO;
                        break;
                    case APAGAR:
                        estado = APAGANDO;
                    default:
                }
            }
        },
        ENTREGANDO_PRODUCTO(TRANSITORIO) {
            @Override
            void siguiente() {
                LOGGER.info("Aquí está tu {}", seleccion);
                monto -= seleccion.monto();
                estado = ENTREGANDO_CAMBIO;
            }
        },
        ENTREGANDO_CAMBIO(TRANSITORIO) {
            @Override
            void siguiente() {
                if (monto > 0) {
                    LOGGER.info("Tu cambio es {}", monto);
                    monto = 0;
                } else {
                    LOGGER.info("Pago exacto, no hay cambio");
                }
                estado = DETENIDO;
            }
        },
        APAGANDO {
            @Override
            void output() {
                LOGGER.info("Apagando...");
            }
        };

        private boolean esTransitorio = false;

        Estado() {
        }

        Estado(DuracionDeEstado transitorio) {
            esTransitorio = true;
        }

        void siguiente(Entrada entrada) {
            throw new RuntimeException("Solo llame siguiente(Entrada entrada) para estados no transitorios");

        }

        void siguiente() {
            throw new RuntimeException("Solo llame siguiente() para estados transitorios");
        }

        void output() {
            LOGGER.info("Monto: {}", monto);
        }
    }

    static void ejecuta(Collection<Entrada> instrucciones) {
        Iterator<Entrada> iteradorEntrada = instrucciones.iterator();
        while (estado != Estado.APAGANDO && iteradorEntrada.hasNext()) {
            estado.siguiente(iteradorEntrada.next());
            while (estado.esTransitorio) {
                estado.siguiente();
            }
            estado.output();
        }
    }

}
