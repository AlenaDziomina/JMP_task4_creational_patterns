package com.grouk.task4_1;

import com.grouk.task4_1.factory.MagicMazeCreator;
import com.grouk.task4_1.factory.MazeCreator;
import com.grouk.task4_1.factory.SimpleMazeCreator;
import com.grouk.task4_1.model.Maze;

public class MazeGame {

    public static void main(String[] argv) {
        MazeCreator creator = getMazeCreatorByName("magic");
        Maze maze = creator.createMaze();
    }

    private static MazeCreator getMazeCreatorByName(String name) {
        switch (name) {
            case "simple":
                return new SimpleMazeCreator();
            case "magic":
                return new MagicMazeCreator();
            default:
                throw new RuntimeException("Unknown maze factory " + name);
        }
    }
}
