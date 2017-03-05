package com.grouk.task4_1.model;

import com.grouk.task4_1.model.simple.Room;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alena on 02.03.2017.
 */
public class Maze {
    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room r) {
        rooms.put(r.getRoomNo(), r);
    }

    public Room roomNo(int r) {
        return rooms.get(r);
    }
}

