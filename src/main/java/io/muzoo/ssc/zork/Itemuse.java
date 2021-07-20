package io.muzoo.ssc.zork;

public class Itemuse {

    private String name = "Default name";

    private int damage = 0;

    public Itemuse() {

    }

    public String name() {
        return this.name;
    }


    public Itemuse name(final String newName) {
        this.name = newName;
        return this;
    }

   // attack damage
    public int attack() {
        return this.damage;
    }

    public Itemuse attack(final int power) {
        this.damage = power;
        return this;
    }

}