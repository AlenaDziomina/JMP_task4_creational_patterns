package com.grouk.task4_1.builder;

import com.grouk.task4_1.model.magic.MagicDoorWall;
import com.grouk.task4_1.model.magic.MagicRoom;
import com.grouk.task4_1.model.magic.Spell;
import com.grouk.task4_1.model.simple.DoorWall;
import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.util.RandomObject;

/**
 * Created by Alena on 05.03.2017.
 */
public class MagicMazeBuilder extends SimpleMazeBuilder {
    private Spell[] spells;

    @Override
    protected Room createRoom(int roomNo) {
        Spell spell = getRandomSpell();
        return new MagicRoom(roomNo, spell);
    }

    @Override
    protected DoorWall createDoorWall(Room r1, Room r2) {
        return new MagicDoorWall(r1, r2, getRandomSpell());
    }

    public void setSpells(Spell[] spells) {
        this.spells = spells;
    }

    private Spell getRandomSpell() {
        return (Spell) RandomObject.getRandomObject(spells);
    }
}
