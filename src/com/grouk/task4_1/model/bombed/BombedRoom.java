package com.grouk.task4_1.model.bombed;

import com.grouk.task4_1.model.Wall;
import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.util.Direction;

import java.util.Set;

/**
 * Created by Alena on 05.03.2017.
 */
public class BombedRoom extends Room {
    protected Bomb bomb;

    public BombedRoom(int roomNo, Bomb bomb) {
        super(roomNo);
        this.bomb = bomb;
    }

    public boolean detonateBomb() {
        if (!bomb.isDetonated()) {
            Set<Direction> bombedDirections = bomb.getBombedDirections();
            bombedDirections.forEach(this::detonateWall);
            bomb.setDetonated();
            return true;
        }
        return false;
    }

    private void detonateWall(Direction direction) {
        Wall wall = getSide(direction);
        if (wall instanceof BombedWall) {
            ((BombedWall) wall).setBombed();
        }
    }
}
