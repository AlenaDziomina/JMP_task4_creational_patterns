package com.grouk.task4_1;

import com.grouk.task4_1.factory.MazeFactory;
import com.grouk.task4_1.factory.MazePrototypeFactory;
import com.grouk.task4_1.model.*;
import com.grouk.task4_1.util.Direction;

public class MazeGame {

    public static void main(String[] argv) {
        String name = "bombed";
        MazeFactory factory = getMazeFactory(name);
        createMaze(factory);
    }

    private static MazeFactory getMazeFactory(String name) {
        switch (name) {
            case "simple":
                return new MazePrototypeFactory(new Maze(), new Room(), new Wall(), new DoorWall());
            case "magic":
                return new MazePrototypeFactory(new Maze(), new MagicRoom(new Spell()), new Wall(), new MagicDoorWall
                        (new Spell()));
            case "bombed":
                return new MazePrototypeFactory(new Maze(), new RoomWithBomb(new Bomb()), new Wall(), new
                        BombedDoorWall());
            default:
                throw new RuntimeException("Unsupported game mode.");
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
