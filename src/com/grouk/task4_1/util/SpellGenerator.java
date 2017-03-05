package com.grouk.task4_1.util;

import com.grouk.task4_1.model.magic.Spell;

import static com.grouk.task4_1.util.MazeState.S;

/**
 * Created by Alena on 05.03.2017.
 */
public class SpellGenerator {
    public static Spell[] generateSpells() {
        Spell[] spells = new Spell[S];
        for (int i = 0; i < S; i++) {
            spells[i] = new Spell("spell_" + i);
        }
        return spells;
    }
}
