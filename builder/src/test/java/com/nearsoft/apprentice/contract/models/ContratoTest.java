package com.nearsoft.apprentice.contract.models;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ContratoTest {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final Logger LOGGER = LoggerFactory.getLogger(ContratoTest.class);

    @Test
    public void testCreaContrato() throws ParseException {
        Contrato contrato = new Contrato(
                "123-ASD-QWER-1988",
                DATE_FORMAT.parse("2017-06-09"),
                new Producto("SEGURO AZUL"),
                EstatusDeContrato.VIGENTE,
                Arrays.asList(new Cliente("Juan", "Perez"), new Cliente("Josefa", "Perez")),
                Arrays.asList(new Cliente("Juana", "Perez"), new Cliente("Alejandra", "Perez"), new Cliente("Pedro", "Perez")),
                new MetodoDePago(TiposMetodoDePago.valueOf("TARJETA"))
        );

        LOGGER.info("{}", contrato);

    }
}