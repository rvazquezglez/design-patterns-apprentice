package com.nearsoft.apprentice.strategy.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void testFight() {
        List<Character> characters = Arrays.asList(
                new Troll(() -> "balanceando mi espada"),
                new Troll(() -> "disparando con arco y flecha"),
                new Troll(() -> "apuñalando"),
                new Knight(() -> "balanceando mi espada"),
                new Knight(() -> "escribiendo con mi pluma"),
                new Knight(null)
        );

        characters.forEach(Character::fight);

    }
}