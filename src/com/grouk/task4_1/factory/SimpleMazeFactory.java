package com.grouk.task4_1.factory;

import com.grouk.task4_1.model.DoorWall;
import com.grouk.task4_1.model.Maze;
import com.grouk.task4_1.model.Room;
import com.grouk.task4_1.model.Wall;

/**
 * Created by Alena on 02.03.2017.
 */
public class SimpleMazeFactory extends AbstractMazeFactory {

    public Wall makeWall(){
        return new Wall();
    }

    public Room makeRoom(int n){
        return new Room(n);
    }

    public DoorWall makeDoorWall(Room r1, Room r2){
        return new DoorWall(r1, r2);
    }
}
