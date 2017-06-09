package com.nearsoft.apprentice.fsm;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static com.nearsoft.apprentice.fsm.Entrada.*;

public class MaquinaExpendedoraTest {

    @Test
    public void testRun() {
        Collection<Entrada> instrucciones = Arrays.asList(
                DIEZ_PESOS,
                DIEZ_PESOS,
                CINCO_PESOS,
                CHESCO
        );

        MaquinaExpendedora.ejecuta(instrucciones);

    }
}