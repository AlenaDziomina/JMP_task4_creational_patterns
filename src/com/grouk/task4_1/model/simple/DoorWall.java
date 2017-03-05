package com.grouk.task4_1.model.simple;

import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.model.simple.Wall;

/**
 * Created by Alena on 02.03.2017.
 */
public class DoorWall extends Wall {
    private Room r1;
    private Room r2;
    protected boolean isOpen;

    public DoorWall(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.isOpen = false;
    }

    @Override
    public boolean enter() {
        return isOpen;
    }

    public void open() {
        this.isOpen = true;
    }
}
