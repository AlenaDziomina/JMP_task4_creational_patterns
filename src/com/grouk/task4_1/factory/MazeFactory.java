package com.grouk.task4_1.factory;

import com.grouk.task4_1.model.simple.DoorWall;
import com.grouk.task4_1.model.Maze;
import com.grouk.task4_1.model.simple.Room;
import com.grouk.task4_1.model.simple.Wall;

/**
 * Created by Alena on 02.03.2017.
 */
public interface MazeFactory {
    Maze makeMaze();

    Wall makeWall();

    Room makeRoom(int n);

    DoorWall makeDoorWall(Room r1, Room r2);
}
