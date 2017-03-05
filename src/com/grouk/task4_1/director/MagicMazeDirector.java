package com.grouk.task4_1.director;

import com.grouk.task4_1.builder.MagicMazeBuilder;
import com.grouk.task4_1.util.SpellGenerator;

/**
 * Created by Alena on 05.03.2017.
 */
public class MagicMazeDirector extends AbstractMazeDirector {

    public MagicMazeDirector() {
        MagicMazeBuilder magicMazeBuilder = new MagicMazeBuilder();
        magicMazeBuilder.setSpells(SpellGenerator.generateSpells());
        this.builder = magicMazeBuilder;
    }
}
