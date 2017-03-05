package com.grouk.task4_1.model.simple;

import com.grouk.task4_1.model.Player;

/**
 * Created by Alena on 05.03.2017.
 */
public class SimplePlayer extends Player {

    @Override
    protected void doFirst() {

    }

    @Override
    protected String getMessage() {
        return "Can't go throw the wall. Try another direction";
    }

    @Override
    protected void trySomething() {

    }
}
