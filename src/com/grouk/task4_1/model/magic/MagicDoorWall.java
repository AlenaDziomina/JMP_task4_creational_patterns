package com.grouk.task4_1.model.magic;

import com.grouk.task4_1.model.simple.DoorWall;
import com.grouk.task4_1.model.simple.Room;

/**
 * Created by Alena on 02.03.2017.
 */
public class MagicDoorWall extends DoorWall {
    private Spell magicSpell;

    public MagicDoorWall(Room r1, Room r2, Spell magicSpell) {
        super(r1, r2);
        this.magicSpell = magicSpell;
    }

    @Override
    public void open() {
        System.out.println("Magic spell needed");
    }

    public void open(Spell spell) {
        this.isOpen = spell.equals(magicSpell);
    }
}
