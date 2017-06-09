package com.nearsoft.apprentice.strategy.lambda;

import java.util.Optional;
import java.util.function.Supplier;

public abstract class Character {

    private Optional<Supplier<String>> weapon = Optional.empty();

    public abstract void fight();

    public Character (Supplier<String> weapon) {
        this.weapon = Optional.ofNullable(weapon);
    }

    public String useWeapon() {
        if (weapon.isPresent()) {
            return weapon.get().get();
        } else {
            return "no tengo arma.";
        }
    }
}
