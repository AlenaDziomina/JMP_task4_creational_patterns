package com.grouk.task4_1.model;

/**
 * Created by Alena on 06.03.2017.
 */
public class MagicRoom extends Room {
    private Spell spell;

    public MagicRoom(Spell spell) {
        super();
        this.spell = spell;
    }

    public MagicRoom(MagicRoom magicRoom) {
        super(magicRoom);
        this.spell = magicRoom.spell.clone();
    }

    @Override
    public MagicRoom clone() {
        return new MagicRoom(this);
    }

    public Spell getSpell() {
        return spell;
    }
}
