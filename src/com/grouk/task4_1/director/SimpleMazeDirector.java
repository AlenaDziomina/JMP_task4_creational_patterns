package com.grouk.task4_1.director;

import com.grouk.task4_1.builder.SimpleMazeBuilder;

/**
 * Created by Alena on 05.03.2017.
 */
public class SimpleMazeDirector extends AbstractMazeDirector {

    public SimpleMazeDirector() {
        builder = new SimpleMazeBuilder();
    }
}
