package com.grouk.task4_1.model;

import com.grouk.task4_1.util.Direction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alena on 02.03.2017.
 */
public class Room {

    private Map<Direction, Wall> sides = new HashMap<>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall simpleWall) {
        sides.put(direction, simpleWall);
    }

    public int getRoomNo() {
        return roomNo;
    }
}
