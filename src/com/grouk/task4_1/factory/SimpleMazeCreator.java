package com.grouk.task4_1.factory;


import com.grouk.task4_1.model.DoorWall;
import com.grouk.task4_1.model.Maze;
import com.grouk.task4_1.model.Room;
import com.grouk.task4_1.model.SimpleWall;
import com.grouk.task4_1.util.Direction;

/**
 * Created by Alena on 03.03.2017.
 */
public class SimpleMazeCreator implements MazeCreator {
    @Override
    public Maze createMaze() {
        Maze maze = makeMaze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        DoorWall d = makeDoorWall(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, makeWall());
        r1.setSide(Direction.EAST, d);
        r1.setSide(Direction.SOUTH, makeWall());
        r1.setSide(Direction.WEST, makeWall());
        r2.setSide(Direction.NORTH, makeWall());
        r2.setSide(Direction.EAST, makeWall());
        r2.setSide(Direction.SOUTH, makeWall());
        r2.setSide(Direction.WEST, d);
        return maze;
    }

    protected SimpleWall makeWall() {
        System.out.println("simple wall");
        return new SimpleWall();
    }

    protected DoorWall makeDoorWall(Room r1, Room r2) {
        System.out.println("simple door");
        return new DoorWall(r1, r2);
    }

    protected Room makeRoom(int i) {
        System.out.println("simple room");
        return new Room(i);
    }

    protected Maze makeMaze() {
        System.out.println("simple maze");
        return new Maze();
    }
}
