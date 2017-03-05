package com.grouk.task4_1.factory;

import com.grouk.task4_1.model.DoorWall;
import com.grouk.task4_1.model.Maze;
import com.grouk.task4_1.model.Room;
import com.grouk.task4_1.model.Wall;

/**
 * Created by Alena on 06.03.2017.
 */
public interface MazeFactory {
    Maze makeMaze();

    Room makeRoom(int roomNo);

    Wall makeWall();

    DoorWall makeDoorWall(Room r1, Room r2);
}
