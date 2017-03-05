package com.grouk.task4_1.model;

import com.grouk.task4_1.util.Direction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alena on 02.03.2017.
 */
public class Room implements Cloneable {

    private Map<Direction, Wall> sides = new HashMap<Direction, Wall>();
    private int roomNo;

    public Room() {

    }

    public Room(Room room) {
        room.sides.entrySet().forEach(e -> setSide(e.getKey(), e.getValue().clone()));
    }

    @Override
    public Room clone() {
        return new Room(this);
    }

    public void init(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    public int getRoomNo() {
        return roomNo;
    }
}
