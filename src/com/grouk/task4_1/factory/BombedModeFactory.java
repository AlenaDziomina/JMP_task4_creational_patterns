package com.grouk.task4_1.factory;

import com.grouk.task4_1.director.BombedMazeDirector;
import com.grouk.task4_1.director.MazeDirector;
import com.grouk.task4_1.model.Player;
import com.grouk.task4_1.model.bombed.BombedPlayer;

/**
 * Created by Alena on 05.03.2017.
 */
public class BombedModeFactory implements ModeFactory {

    @Override
    public MazeDirector createDirector() {
        return new BombedMazeDirector();
    }

    @Override
    public Player createPlayer() {
        return new BombedPlayer();
    }
}
