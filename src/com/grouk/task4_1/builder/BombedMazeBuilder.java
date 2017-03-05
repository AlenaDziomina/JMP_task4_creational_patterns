package com.grouk.task4_1.builder;

import com.grouk.task4_1.model.bombed.Bomb;
import com.grouk.task4_1.model.bombed.BombedRoom;
import com.grouk.task4_1.model.bombed.BombedWall;
import com.grouk.task4_1.model.simple.CommonWall;
import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.util.Direction;
import com.grouk.task4_1.util.RandomObject;

/**
 * Created by Alena on 05.03.2017.
 */
public class BombedMazeBuilder extends SimpleMazeBuilder {
    private Direction[] directions;

    @Override
    protected Room createRoom(int roomNo) {
        Bomb bomb = createBomb();
        return new BombedRoom(roomNo, bomb);
    }

    @Override
    protected CommonWall createCommonWall(Room r1, Room r2) {
        return new BombedWall(r1, r2);
    }

    public void setDirections(Direction[] directions) {
        this.directions = directions;
    }

    private Bomb createBomb() {
        Bomb bomb = new Bomb();
        bomb.setBombedDirection(getRandomDirection());
        return bomb;
    }

    private Direction getRandomDirection() {
        return (Direction) RandomObject.getRandomObject(directions);
    }
}
