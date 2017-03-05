package com.grouk.task4_1.model.magic;

import com.grouk.task4_1.model.Player;
import com.grouk.task4_1.model.Wall;
import com.grouk.task4_1.model.simple.Room;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alena on 05.03.2017.
 */
public class MagicPlayer extends Player {
    private Set<Spell> spells = new HashSet<>();

    @Override
    protected void doFirst() {
        inspectRoomForSpell(currentRoom1);
    }

    @Override
    protected String getMessage() {
        return "Can't go throw the wall. Try magic spells.";
    }

    @Override
    protected void trySomething() {
        tryMagicSpells(currentWall);
    }

    private void inspectRoomForSpell(Room room) {
        if (room instanceof MagicRoom) {
            Spell spell = ((MagicRoom) room).getSpell();
            spells.add(spell);
            System.out.println("Magic spell found: " + spell);
        }
    }

    private void tryMagicSpells(Wall wall) {
        if (wall instanceof MagicDoorWall) {
            spells.forEach(((MagicDoorWall) wall)::open);
        }
    }
}
