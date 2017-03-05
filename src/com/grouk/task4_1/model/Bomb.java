package com.grouk.task4_1.model;

import com.grouk.task4_1.util.Direction;

/**
 * Created by Alena on 06.03.2017.
 */
public class Bomb implements Cloneable {
    private boolean isDetonated;

    public Bomb() {
    }

    public Bomb(Bomb bomb) {
        this.isDetonated = bomb.isDetonated;
    }

    @Override
    protected Bomb clone() {
        return new Bomb(this);
    }

    public boolean isDetonated() {
        return isDetonated;
    }

    public Direction getRandomDirection() {
        return Direction.SOUTH;
    }
}
