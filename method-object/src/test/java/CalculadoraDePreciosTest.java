import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculadoraDePreciosTest {

    @Test
    public void testCalculaCostos() {
        CalculadoraDePrecios calculadora = new CalculadoraDePrecios();

        double costoTotal = calculadora.calculaPrecios();

        assertThat(costoTotal, is(115.0));

    }
}