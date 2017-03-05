package com.grouk.task4_1.director;

import com.grouk.task4_1.builder.MazeBuilder;
import com.grouk.task4_1.model.simple.Maze;

/**
 * Created by Alena on 05.03.2017.
 */
abstract class AbstractMazeDirector implements MazeDirector {

    protected MazeBuilder builder;

    @Override
    public Maze construct(int[][] x) {
        builder.buildMaze();

        int k = x.length;
        int n = x[0].length;

        constructRooms(k);
        constructCommonWalls(n, x);
        constructDoorWalls(n, x);
        constructSimpleWalls(k);

        return builder.getMaze();
    }

    protected void constructDoorWalls(int n, int[][] x) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i][j] == 1) {
                    builder.buildDoorWall(i, j);
                }
            }
        }
    }

    protected void constructSimpleWalls(int k) {
        for (int i = 0; i < k; i++) {
            builder.buildSimpleWall(i);
        }
    }

    protected void constructCommonWalls(int n, int[][] x) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i][j] == -1) {
                    builder.buildCommonWall(i, j);
                }
            }
        }
    }

    protected void constructRooms(int k) {
        for (int i = 0; i < k; i++) {
            builder.buildRoom(i);
        }
    }
}
