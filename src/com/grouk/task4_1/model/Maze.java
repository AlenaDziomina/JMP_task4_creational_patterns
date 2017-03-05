package com.grouk.task4_1.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alena on 02.03.2017.
 */
public class Maze implements Cloneable {
    private Map<Integer, Room> rooms = new HashMap<>();

    public Maze() {
    }

    public Maze(Maze maze) {
        maze.rooms.entrySet().forEach(r -> this.addRoom(r.getValue()));
    }

    @Override
    public Maze clone() {
        return new Maze(this);
    }

    public void addRoom(Room r) {
        rooms.put(r.getRoomNo(), r);
    }

    public Room roomNo(int r) {
        return rooms.get(r);
    }
}

