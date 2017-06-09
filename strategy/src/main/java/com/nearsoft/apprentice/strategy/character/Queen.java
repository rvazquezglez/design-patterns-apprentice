package com.nearsoft.apprentice.strategy.character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.*;

public class Queen extends Character {
    private static final Logger LOGGER = LoggerFactory.getLogger(Queen.class);

    @Override
    public void fight() {
        LOGGER.info("Soy la REINA y estoy {}", weaponBehaviour.useWeapon());
    }
}
