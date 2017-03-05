package com.grouk.task4_1.factory;

import com.grouk.task4_1.director.MazeDirector;
import com.grouk.task4_1.director.SimpleMazeDirector;
import com.grouk.task4_1.model.Player;
import com.grouk.task4_1.model.simple.SimplePlayer;

/**
 * Created by Alena on 05.03.2017.
 */
public class SimpleModeFactory implements ModeFactory {

    @Override
    public MazeDirector createDirector() {
        return new SimpleMazeDirector();
    }

    @Override
    public Player createPlayer() {
        return new SimplePlayer();
    }
}
