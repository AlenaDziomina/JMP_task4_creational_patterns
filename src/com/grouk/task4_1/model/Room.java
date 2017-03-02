package com.grouk.task4_1.model;

import com.grouk.task4_1.util.Direction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alena on 02.03.2017.
 */
public class Room {

    private Map<Direction, SimpleWall> sides = new HashMap<Direction, SimpleWall>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public SimpleWall getSide (Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, SimpleWall simpleWall) {
        sides.put(direction, simpleWall);
    }

    public int getRoomNo() {
        return roomNo;
    }
}
