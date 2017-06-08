import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculadoraDePrecios {

    private static final Logger LOGGER = LoggerFactory.getLogger(CalculadoraDePrecios.class);

    public double calculaPrecios() {
        double precioBase = 100;

        double montoIva = precioBase * 0.15;
        double precioTotal = precioBase + montoIva;

        LOGGER.info("Precio total: ${}, monto IVA: ${}", precioTotal, montoIva);

        return precioTotal;

    }
}
