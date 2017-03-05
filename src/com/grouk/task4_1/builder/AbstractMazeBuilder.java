package com.grouk.task4_1.builder;

import com.grouk.task4_1.model.Wall;
import com.grouk.task4_1.model.simple.CommonWall;
import com.grouk.task4_1.model.simple.DoorWall;
import com.grouk.task4_1.model.simple.Maze;
import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.util.Direction;

import static com.grouk.task4_1.util.DirectionUtil.defineDirection;

/**
 * Created by Alena on 05.03.2017.
 */
abstract class AbstractMazeBuilder implements MazeBuilder {
    protected Maze currentMaze;

    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    @Override
    public void buildSimpleWall(int roomNo) {
        Room room = currentMaze.getRoomByNo(roomNo);
        buildSimpleWallOnDirection(room, Direction.NORTH);
        buildSimpleWallOnDirection(room, Direction.SOUTH);
        buildSimpleWallOnDirection(room, Direction.WEST);
        buildSimpleWallOnDirection(room, Direction.EAST);
    }

    private void buildSimpleWallOnDirection(Room room, Direction direction) {
        if (room.getSide(direction) == null) {
            room.setSide(direction, createSimpleWall());
        }
    }

    @Override
    public void buildRoom(int roomNo) {
        Room room = createRoom(roomNo);
        currentMaze.addRoom(room);
    }

    @Override
    public void buildCommonWall(int roomNo1, int roomNo2) {
        Room room1 = currentMaze.getRoomByNo(roomNo1);
        Room room2 = currentMaze.getRoomByNo(roomNo2);
        CommonWall commonWall = createCommonWall(room1, room2);
        room1.setSide(defineDirection(roomNo1, roomNo2), commonWall);
        room2.setSide(defineDirection(roomNo2, roomNo1), commonWall);
    }

    @Override
    public void buildDoorWall(int roomNo1, int roomNo2) {
        Room room1 = currentMaze.getRoomByNo(roomNo1);
        Room room2 = currentMaze.getRoomByNo(roomNo2);
        DoorWall doorWall = createDoorWall(room1, room2);
        room1.setSide(defineDirection(roomNo1, roomNo2), doorWall);
        room2.setSide(defineDirection(roomNo2, roomNo1), doorWall);
    }

    protected abstract DoorWall createDoorWall(Room r1, Room r2);

    protected abstract CommonWall createCommonWall(Room r1, Room r2);

    protected abstract Room createRoom(int roomNo);

    protected abstract Wall createSimpleWall();
}
