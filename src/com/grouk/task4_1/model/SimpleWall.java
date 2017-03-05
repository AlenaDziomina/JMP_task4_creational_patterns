package com.grouk.task4_1.model;

/**
 * Created by Alena on 02.03.2017.
 */
public class SimpleWall implements Wall {
    public SimpleWall() {
    }

    public boolean enter() {
        return false;
    }

    @Override
    public void open() {
        System.out.print("Can't be opened");
    }
}
