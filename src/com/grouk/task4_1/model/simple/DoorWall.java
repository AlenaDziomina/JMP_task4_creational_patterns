package com.grouk.task4_1.model.simple;

/**
 * Created by Alena on 02.03.2017.
 */
public class DoorWall extends CommonWall {

    protected boolean isOpen;

    public DoorWall(Room r1, Room r2) {
        super(r1, r2);
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
