package com.grouk.task4_1.builder;

import com.grouk.task4_1.model.Wall;
import com.grouk.task4_1.model.simple.CommonWall;
import com.grouk.task4_1.model.simple.DoorWall;
import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.model.simple.SimpleWall;

/**
 * Created by Alena on 05.03.2017.
 */
public class SimpleMazeBuilder extends AbstractMazeBuilder {

    @Override
    protected DoorWall createDoorWall(Room r1, Room r2) {
        return new DoorWall(r1, r2);
    }

    @Override
    protected CommonWall createCommonWall(Room r1, Room r2) {
        return new CommonWall(r1, r2);
    }

    @Override
    protected Room createRoom(int roomNo) {
        return new Room(roomNo);
    }

    @Override
    protected Wall createSimpleWall() {
        return new SimpleWall();
    }
}
