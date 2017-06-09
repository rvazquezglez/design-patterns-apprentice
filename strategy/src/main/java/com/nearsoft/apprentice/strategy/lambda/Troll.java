package com.nearsoft.apprentice.strategy.lambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

public class Troll extends Character {
    private static final Logger LOGGER = LoggerFactory.getLogger(Troll.class);

    public Troll(Supplier<String> weapon) {
        super(weapon);
    }

    @Override
    public void fight() {
        LOGGER.info("TROLOLOL, estoy {}", useWeapon());
    }
}
