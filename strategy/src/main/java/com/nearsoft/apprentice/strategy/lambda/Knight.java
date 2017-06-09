package com.nearsoft.apprentice.strategy.lambda;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

public class Knight extends Character {
    private static final Logger LOGGER = LoggerFactory.getLogger(Knight.class);

    public Knight(Supplier<String> weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        LOGGER.info("Soy un caballero y estoy {}", useWeapon());
    }
}
