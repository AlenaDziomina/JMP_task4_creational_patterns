package com.grouk.task4_1;

import com.grouk.task4_1.model.DoorWall;
import com.grouk.task4_1.model.Maze;
import com.grouk.task4_1.model.Room;
import com.grouk.task4_1.model.Wall;
import com.grouk.task4_1.util.Direction;

public class MazeGame {

    public static void main(String[] argv) {
        createMaze();
    }

    private static Maze createMaze() {
        Maze aMaze = new Maze();
        Room r1 = new Room (1);
        Room r2 = new Room (2);
        DoorWall d = new DoorWall(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.NORTH, new Wall());
        r1.setSide(Direction.EAST, d);
        r1.setSide(Direction.SOUTH, new Wall());
        r1.setSide(Direction.WEST, new Wall());
        r2.setSide(Direction.NORTH, new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.SOUTH, new Wall());
        r2.setSide(Direction.WEST, d);
        return aMaze;
    }
}
