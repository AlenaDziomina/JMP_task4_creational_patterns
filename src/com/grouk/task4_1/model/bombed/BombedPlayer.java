package com.grouk.task4_1.model.bombed;

import com.grouk.task4_1.model.Player;
import com.grouk.task4_1.model.simple.Room;

/**
 * Created by Alena on 05.03.2017.
 */
public class BombedPlayer extends Player {

    @Override
    protected void doFirst() {

    }

    @Override
    protected String getMessage() {
        return "Can't go throw the wall. Try detonate bomb.";
    }

    @Override
    protected void trySomething() {
        tryBomb(currentRoom1);
    }

    private void tryBomb(Room room) {
        if (room instanceof BombedRoom) {
            if (((BombedRoom) room).detonateBomb()) {
                System.out.println("Bomb detonated");
            } else {
                System.out.println("Bomb already has been detonated");
            }
        }
    }
}
