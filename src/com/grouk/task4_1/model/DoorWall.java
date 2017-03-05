package com.grouk.task4_1.model;

/**
 * Created by Alena on 02.03.2017.
 */
public class DoorWall extends Wall {
    private Room r1;
    private Room r2;
    private boolean isOpen;

    public DoorWall() {
        this.isOpen = false;
    }

    public DoorWall(DoorWall doorWall) {
        this.isOpen = doorWall.isOpen;
    }

    @Override
    public DoorWall clone() {
        return new DoorWall(this);
    }

    @Override
    public boolean enter() {
        return isOpen;
    }

    @Override
    public void open() {
        isOpen = true;
    }

    public void init(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
}
