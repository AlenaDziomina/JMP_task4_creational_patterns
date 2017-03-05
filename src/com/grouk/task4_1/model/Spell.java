package com.grouk.task4_1.model;

/**
 * Created by Alena on 06.03.2017.
 */
public class Spell implements Cloneable {
    private String spell = "spell";

    public Spell() {
    }

    public Spell(Spell spell) {
        this.spell = spell.getSpell();
    }

    public String getSpell() {
        return spell;
    }

    @Override
    protected Spell clone() {
        return new Spell(this);
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
}
