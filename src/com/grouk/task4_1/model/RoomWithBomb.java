package com.grouk.task4_1.model;

import com.grouk.task4_1.util.Direction;

/**
 * Created by Alena on 06.03.2017.
 */
public class RoomWithBomb extends Room {
    private Bomb bomb;

    public RoomWithBomb(Bomb bomb) {
        super();
        this.bomb = bomb;
    }

    public RoomWithBomb(RoomWithBomb roomWithBomb) {
        super(roomWithBomb);
        this.bomb = roomWithBomb.bomb.clone();
    }

    @Override
    public Room clone() {
        return new RoomWithBomb(this);
    }

    public void detonateBomb() {
        if (!bomb.isDetonated()) {
            detonateWall(bomb.getRandomDirection());
        }
    }

    private void detonateWall(Direction direction) {
        Wall wall = this.getSide(direction);
        if (wall instanceof BombedDoorWall) {
            ((BombedDoorWall) wall).detonate();
        }
    }
}
