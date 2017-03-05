package com.grouk.task4_1.director;

import com.grouk.task4_1.builder.BombedMazeBuilder;
import com.grouk.task4_1.util.Direction;

import static com.grouk.task4_1.util.Direction.*;

/**
 * Created by Alena on 05.03.2017.
 */
public class BombedMazeDirector extends AbstractMazeDirector {

    public BombedMazeDirector() {
        BombedMazeBuilder bombedMazeBuilder = new BombedMazeBuilder();
        Direction[] directions = new Direction[]{NORTH, WEST, EAST, SOUTH};
        bombedMazeBuilder.setDirections(directions);
        this.builder = bombedMazeBuilder;
    }
}
