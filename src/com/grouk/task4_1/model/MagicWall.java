package com.grouk.task4_1.model;

/**
 * Created by Alena on 02.03.2017.
 */
public class MagicWall extends Wall {
    private String magicSpell;

    public MagicWall(String magicSpell) {
        this.magicSpell = magicSpell;
    }

    public String getMagicSpell() {
        return magicSpell;
    }
}
