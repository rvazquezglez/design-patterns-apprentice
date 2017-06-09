package com.nearsoft.apprentice.strategy.character;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.*;

public class Knight extends Character {
    private static final Logger LOGGER = LoggerFactory.getLogger(Knight.class);

    @Override
    public void fight() {
        LOGGER.info("Soy un caballero y estoy {}", weaponBehaviour.useWeapon());
    }
}
