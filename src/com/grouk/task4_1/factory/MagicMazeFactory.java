package com.grouk.task4_1.factory;

import com.grouk.task4_1.model.magic.MagicDoorWall;
import com.grouk.task4_1.model.magic.MagicRoom;
import com.grouk.task4_1.model.magic.MagicWall;
import com.grouk.task4_1.model.simple.DoorWall;
import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.model.simple.Wall;

/**
 * Created by Alena on 02.03.2017.
 */
public class MagicMazeFactory extends AbstractMazeFactory {

    @Override
    public Wall makeWall() {
        return new MagicWall(getSpell());
    }

    @Override
    public Room makeRoom(int n) {
        return new MagicRoom(n, getSpell());
    }

    @Override
    public DoorWall makeDoorWall(Room r1, Room r2) {
        return new MagicDoorWall(r1, r2, getSpell());
    }

    private String getSpell() {
        return "spell";
    }
}
