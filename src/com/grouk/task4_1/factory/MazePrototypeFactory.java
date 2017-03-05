package com.grouk.task4_1.factory;

import com.grouk.task4_1.model.DoorWall;
import com.grouk.task4_1.model.Maze;
import com.grouk.task4_1.model.Room;
import com.grouk.task4_1.model.Wall;

/**
 * Created by Alena on 06.03.2017.
 */
public class MazePrototypeFactory implements MazeFactory {
    private Maze prototypeMaze;
    private Room prototypeRoom;
    private Wall prototypeWall;
    private DoorWall prototypeDoor;

    public MazePrototypeFactory(Maze maze, Room room, Wall wall, DoorWall doorWall) {
        this.prototypeMaze = maze;
        this.prototypeRoom = room;
        this.prototypeWall = wall;
        this.prototypeDoor = doorWall;
    }

    @Override
    public Maze makeMaze() {
        return prototypeMaze.clone();
    }

    @Override
    public Room makeRoom(int roomNo) {
        Room room = prototypeRoom.clone();
        room.init(roomNo);
        return room;
    }

    @Override
    public Wall makeWall() {
        return prototypeWall.clone();
    }

    @Override
    public DoorWall makeDoorWall(Room r1, Room r2) {
        DoorWall doorWall = prototypeDoor.clone();
        doorWall.init(r1, r2);
        return doorWall;
    }
}
