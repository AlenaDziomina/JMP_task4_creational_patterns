package com.grouk.task4_1.builder;

import com.grouk.task4_1.model.simple.Maze;

/**
 * Created by Alena on 05.03.2017.
 */
public interface MazeBuilder {

    void buildMaze();

    void buildRoom(int roomNo);

    void buildSimpleWall(int roomNo);

    void buildCommonWall(int roomNo1, int roomNo2);

    void buildDoorWall(int roomNo1, int roomNo2);

    Maze getMaze();
}
