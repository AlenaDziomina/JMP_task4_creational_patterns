package com.grouk.task4_1;

import com.grouk.task4_1.director.MazeDirector;
import com.grouk.task4_1.factory.*;
import com.grouk.task4_1.model.Player;
import com.grouk.task4_1.model.simple.Maze;

import static com.grouk.task4_1.util.MazeState.MODE;

public class MazeGame {

    public static void main(String[] argv) {
        ModeFactory modeFactory = getModeFactoryByName(MODE);

        int[][] x = MazeMatrixFactory.createMazeMatrix();
        MazeDirector director = modeFactory.createDirector();
        Maze maze = director.construct(x);

        Player player = modeFactory.createPlayer();
        player.play(maze);
    }

    private static ModeFactory getModeFactoryByName(String name) {
        switch (name) {
            case "simple":
                return new SimpleModeFactory();
            case "magic":
                return new MagicModeFactory();
            case "bombed":
                return new BombedModeFactory();
            default:
                throw new RuntimeException("Unknown maze factory " + name);
        }
    }
}
