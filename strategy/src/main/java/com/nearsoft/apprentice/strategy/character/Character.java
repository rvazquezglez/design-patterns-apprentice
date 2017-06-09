package com.nearsoft.apprentice.strategy.character;

import com.nearsoft.apprentice.strategy.weapon.WeaponBehaviour;

public abstract class Character {

    protected WeaponBehaviour weaponBehaviour;

    public abstract void fight();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
