package com.grouk.task4_1.model.bombed;

import com.grouk.task4_1.util.Direction;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alena on 05.03.2017.
 */
public class Bomb {
    private Set<Direction> directions;
    private boolean isDetonated = false;

    public Bomb() {
        this.directions = new HashSet<>();
    }

    public void setBombedDirection(Direction direction) {
        directions.add(direction);
    }

    public Set<Direction> getBombedDirections() {
        return directions;
    }

    public boolean isDetonated() {
        return isDetonated;
    }

    public void setDetonated() {
        isDetonated = true;
    }
}
