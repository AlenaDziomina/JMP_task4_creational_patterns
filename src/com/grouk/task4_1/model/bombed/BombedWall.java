package com.grouk.task4_1.model.bombed;

import com.grouk.task4_1.model.simple.CommonWall;
import com.grouk.task4_1.model.simple.Room;

/**
 * Created by Alena on 05.03.2017.
 */
public class BombedWall extends CommonWall {
    private boolean isBombed;

    public BombedWall(Room r1, Room r2) {
        super(r1, r2);
        isBombed = false;
    }

    public void setBombed() {
        isBombed = true;
    }

    @Override
    public boolean enter() {
        return isBombed;
    }

}
