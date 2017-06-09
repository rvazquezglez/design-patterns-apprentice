package com.nearsoft.apprentice.strategy.character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.*;

public class King extends Character {

    private static final Logger LOGGER = LoggerFactory.getLogger(King.class);

    @Override
    public void fight() {
        LOGGER.info("Soy el REY y estoy {}", weaponBehaviour.useWeapon());
    }
}
