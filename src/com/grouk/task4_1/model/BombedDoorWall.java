package com.grouk.task4_1.model;

/**
 * Created by Alena on 06.03.2017.
 */
public class BombedDoorWall extends DoorWall {

    public BombedDoorWall() {
        super();
    }

    public BombedDoorWall(BombedDoorWall bombedDoorWall) {
        super(bombedDoorWall);
    }

    @Override
    public BombedDoorWall clone() {
        return new BombedDoorWall(this);
    }

    @Override
    public void open() {
        System.out.println("Wall need to be detonated.");
    }

    public void detonate() {
        super.open();
    }
}
