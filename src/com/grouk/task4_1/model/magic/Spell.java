package com.grouk.task4_1.model.magic;

/**
 * Created by Alena on 05.03.2017.
 */
public class Spell {
    private String spell;

    public Spell(String spell) {
        this.spell = spell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spell spell1 = (Spell) o;

        return spell.equals(spell1.spell);
    }

    @Override
    public int hashCode() {
        return spell.hashCode();
    }

    @Override
    public String toString() {
        return spell;
    }
}
