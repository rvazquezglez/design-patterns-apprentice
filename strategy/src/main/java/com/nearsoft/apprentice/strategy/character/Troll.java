package com.nearsoft.apprentice.strategy.character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.*;

public class Troll extends Character {
    private static final Logger LOGGER = LoggerFactory.getLogger(Troll.class);

    @Override
    public void fight() {
        LOGGER.info("Trololol, estoy {}", weaponBehaviour.useWeapon());
    }
}
