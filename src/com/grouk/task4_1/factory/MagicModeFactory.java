package com.grouk.task4_1.factory;

import com.grouk.task4_1.director.MagicMazeDirector;
import com.grouk.task4_1.director.MazeDirector;
import com.grouk.task4_1.model.Player;
import com.grouk.task4_1.model.magic.MagicPlayer;

/**
 * Created by Alena on 05.03.2017.
 */
public class MagicModeFactory implements ModeFactory {
    @Override
    public MazeDirector createDirector() {
        return new MagicMazeDirector();
    }

    @Override
    public Player createPlayer() {
        return new MagicPlayer();
    }
}
