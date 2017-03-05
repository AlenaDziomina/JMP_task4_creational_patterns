package com.grouk.task4_1.model.magic;

import com.grouk.task4_1.model.simple.Room;

/**
 * Created by Alena on 05.03.2017.
 */
public class MagicRoom extends Room {
    private Spell spell;

    public MagicRoom(int roomNo, Spell spell) {
        super(roomNo);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }
}
