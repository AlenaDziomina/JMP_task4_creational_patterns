package com.grouk.task4_1.factory;

import com.grouk.task4_1.model.MagicDoorWall;
import com.grouk.task4_1.model.MagicRoom;
import com.grouk.task4_1.model.Room;

/**
 * Created by Alena on 03.03.2017.
 */
public class MagicMazeCreator extends SimpleMazeCreator {
    protected MagicDoorWall makeDoorWall(Room r1, Room r2) {
        System.out.println("magic door");
        return new MagicDoorWall(r1, r2, getSpell());
    }

    @Override
    protected Room makeRoom(int i) {
        System.out.println("magic room");
        return new MagicRoom(i, getSpell());
    }

    private String getSpell() {
        return "spell";
    }
}
