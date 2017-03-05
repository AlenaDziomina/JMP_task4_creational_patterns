package com.grouk.task4_1.model;

/**
 * Created by Alena on 06.03.2017.
 */
public class MagicDoorWall extends DoorWall {
    private Spell spell;

    public MagicDoorWall(Spell spell) {
        super();
        this.spell = spell;
    }

    public MagicDoorWall(MagicDoorWall magicDoorWall) {
        super(magicDoorWall);
        this.spell = magicDoorWall.spell.clone();
    }

    @Override
    public MagicDoorWall clone() {
        return new MagicDoorWall(this);
    }

    @Override
    public void open() {
        System.out.println("Wall need to be detonated.");
    }

    public void openBySpell(Spell spell) {
        if (this.spell.equals(spell)) {
            super.open();
        }
    }
}
