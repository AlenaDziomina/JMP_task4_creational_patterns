package com.grouk.task4_1.factory;

import com.grouk.task4_1.director.MazeDirector;
import com.grouk.task4_1.model.Player;

/**
 * Created by Alena on 05.03.2017.
 */
public interface ModeFactory {
    MazeDirector createDirector();

    Player createPlayer();
}
