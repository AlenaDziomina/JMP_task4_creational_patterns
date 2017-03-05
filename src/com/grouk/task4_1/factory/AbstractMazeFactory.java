package com.grouk.task4_1.factory;

import com.grouk.task4_1.model.Maze;

/**
 * Created by Alena on 02.03.2017.
 */
abstract class AbstractMazeFactory implements MazeFactory {
    @Override
    public Maze makeMaze() {
        return new Maze();
    }
}
