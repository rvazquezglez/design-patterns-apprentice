package com.nearsoft.apprentice.fsm;

/**
 * Representa el panel de la máquina expendedora
 */
public enum Entrada {
    TOSTON(0.5), PESO(1), DOS_PESOS(2), CINCO_PESOS(5), DIEZ_PESOS(10),
    BOLSA_DE_PAPAS(8), CHESCO(12), PAQUETE_DE_GALLETAS(11), BOLSA_DE_CACAHUATES(4.5),
    ABORTAR_TRANSACCION {
        public double monto(){
            throw new RuntimeException("ABORTAR.monto()");
        }
    },
    DETENER {
        public double monto(){
            throw new RuntimeException("DETENER.monto()");
        }
    };

    private double valor;

    Entrada() {
    }

    Entrada(double valor) {
        this.valor = valor;
    }

    public double monto(){
        return valor;
    }
}
