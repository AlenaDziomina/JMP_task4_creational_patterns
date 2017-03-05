package com.grouk.task4_1.util;

import static com.grouk.task4_1.util.MazeState.N;

/**
 * Created by Alena on 05.03.2017.
 */
public class DirectionUtil {

    public static Direction defineDirection(int roomNo1, int roomNo2) {
        switch (roomNo1 - roomNo2) {
            case N:
                return Direction.NORTH;
            case -N:
                return Direction.SOUTH;
            case 1:
                return Direction.EAST;
            case -1:
                return Direction.WEST;
            default:
                throw new RuntimeException("Unknown direction. Rooms " + roomNo1 + " and " + roomNo2 + " has no " +
                        "common side.");
        }
    }
}
