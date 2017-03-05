package com.grouk.task4_1.model.simple;

/**
 * Created by Alena on 05.03.2017.
 */
public class CommonWall extends SimpleWall {
    private Room r1;
    private Room r2;

    public CommonWall(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public Room getOppositeRoom(Room room) {
        if (room.equals(r1)) {
            return r2;
        } else if (room.equals(r2)) {
            return r1;
        } else {
            return null;
        }
    }
}
