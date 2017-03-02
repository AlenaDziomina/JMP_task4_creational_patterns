package com.grouk.task4_1;

import com.grouk.task4_1.factory.MagicMazeFactory;
import com.grouk.task4_1.factory.MazeFactory;
import com.grouk.task4_1.factory.SimpleMazeFactory;
import com.grouk.task4_1.model.DoorWall;
import com.grouk.task4_1.model.Maze;
import com.grouk.task4_1.model.Room;
import com.grouk.task4_1.model.Wall;
import com.grouk.task4_1.util.Direction;

public class MazeGame {

    public static void main(String[] argv) {
        MazeFactory factory = getMazeFactoryByName("magic");
        createMaze(factory);
    }

    private static MazeFactory getMazeFactoryByName(String name) {
        switch (name){
            case "simple": return new SimpleMazeFactory();
            case "magic": return new MagicMazeFactory();
            default: throw new RuntimeException("Unknown maze factory " + name);
        }
    }

    private static Maze createMaze(MazeFactory factory) {
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        DoorWall d = factory.makeDoorWall(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.NORTH, factory.makeWall());
        r1.setSide(Direction.EAST, d);
        r1.setSide(Direction.SOUTH, factory.makeWall());
        r1.setSide(Direction.WEST, factory.makeWall());
        r2.setSide(Direction.NORTH, factory.makeWall());
        r2.setSide(Direction.EAST, factory.makeWall());
        r2.setSide(Direction.SOUTH, factory.makeWall());
        r2.setSide(Direction.WEST, d);
        return aMaze;
    }
}
