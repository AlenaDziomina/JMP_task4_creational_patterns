package com.grouk.task4_1.model;

/**
 * Created by Alena on 02.03.2017.
 */
public class Wall implements Cloneable {
    public Wall() {
    }

    @Override
    public Wall clone() {
        return new Wall();
    }

    public boolean enter() {
        return false;
    }

    public void open() {
        System.out.println("Wall can not be opened.");
    }
}
