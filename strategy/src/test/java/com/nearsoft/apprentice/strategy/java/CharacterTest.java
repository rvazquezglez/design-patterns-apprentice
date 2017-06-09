package com.nearsoft.apprentice.strategy.java;

import com.nearsoft.apprentice.strategy.weapon.BowAndArrowBehaviour;
import com.nearsoft.apprentice.strategy.weapon.SwordBehaviour;
import com.nearsoft.apprentice.strategy.character.King;
import com.nearsoft.apprentice.strategy.character.Knight;
import com.nearsoft.apprentice.strategy.character.Queen;
import com.nearsoft.apprentice.strategy.character.Troll;
import com.nearsoft.apprentice.strategy.character.Character;
import com.nearsoft.apprentice.strategy.weapon.AxeBehaviour;
import com.nearsoft.apprentice.strategy.weapon.KnifeBehaviour;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CharacterTest {

    @Test
    public void testCharactersWithWeapons() throws Exception {
        Character king = new King();
        king.setWeaponBehaviour(new KnifeBehaviour());

        Character queen = new Queen();
        queen.setWeaponBehaviour(new BowAndArrowBehaviour());

        Character troll = new Troll();
        troll.setWeaponBehaviour(new AxeBehaviour());

        Character secondTroll = new Troll();
        secondTroll.setWeaponBehaviour(new SwordBehaviour());

        Character knight = new Knight();
        knight.setWeaponBehaviour(new SwordBehaviour());

        Character secondKnight = new Knight();
        secondKnight.setWeaponBehaviour(new BowAndArrowBehaviour());

        List<Character> characters = Arrays.asList(king, queen, troll, secondTroll, knight, secondKnight);

        for (Character character : characters) {
            character.fight();
        }

    }

}

