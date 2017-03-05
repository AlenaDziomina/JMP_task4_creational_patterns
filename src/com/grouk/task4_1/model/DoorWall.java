package com.grouk.task4_1.model;

/**
 * Created by Alena on 02.03.2017.
 */
public class DoorWall extends SimpleWall {
    protected boolean isOpen;
    private Room r1;
    private Room r2;

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
