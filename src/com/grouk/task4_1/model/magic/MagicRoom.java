package com.grouk.task4_1.model.magic;

import com.grouk.task4_1.model.simple.Room;

/**
 * Created by Alena on 02.03.2017.
 */
public class MagicRoom extends Room {
    private String magicSpell;

    public MagicRoom(int roomNo, String magicSpell) {
        super(roomNo);
        this.magicSpell = magicSpell;
    }

    public String getMagicSpell() {
        return magicSpell;
    }
}
