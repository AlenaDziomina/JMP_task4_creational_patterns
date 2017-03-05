package com.grouk.task4_1.model;

import com.grouk.task4_1.model.simple.CommonWall;
import com.grouk.task4_1.model.simple.Maze;
import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.util.Direction;
import com.grouk.task4_1.util.MazeState;
import com.grouk.task4_1.util.RandomObject;

import static com.grouk.task4_1.util.Direction.*;

/**
 * Created by Alena on 05.03.2017.
 */
public abstract class Player {
    protected Room currentRoom1;
    protected Wall currentWall;

    private Direction[] directions = new Direction[]{NORTH, WEST, EAST, SOUTH};
    private int currentRoomNo = 0;
    private int finish = MazeState.K - 1;

    abstract protected void doFirst();

    abstract protected String getMessage();

    abstract protected void trySomething();

    public void play(Maze maze) {
        while (currentRoomNo != finish) {
            go(maze);
        }
        System.out.println("Finished: current room " + currentRoomNo);
    }

    private void go(Maze maze) {
        System.out.println("Current room " + currentRoomNo);
        currentRoom1 = maze.getRoomByNo(currentRoomNo);

        Direction direction = selectDirection();
        System.out.println("Go from room " + currentRoomNo + " to the " + direction);
        currentWall = currentRoom1.getSide(direction);

        doFirst();
        makeAttempt();
    }

    private void makeAttempt() {
        currentWall.open();
        Room nextRoom = getNextRoom();

        if (nextRoom == null) {
            System.out.println(getMessage());
            trySomething();
            nextRoom = getNextRoom();
        }

        if (nextRoom != null) {
            currentRoomNo = nextRoom.getRoomNo();
        }
    }

    private Room getNextRoom() {
        if (currentWall.enter()) {
            return goThrow(currentRoom1, currentWall);
        }
        return null;
    }

    private Room goThrow(Room room, Wall wall) {
        if (wall instanceof CommonWall) {
            return ((CommonWall) wall).getOppositeRoom(room);
        } else {
            return null;
        }
    }

    private Direction selectDirection() {
        return (Direction) RandomObject.getRandomObject(directions);
    }
}
