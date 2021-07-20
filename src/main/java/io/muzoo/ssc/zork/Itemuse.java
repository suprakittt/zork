package io.muzoo.ssc.zork;

public class Itemuse {

    private String name = "Default";

    private int damage = 0;

    public Itemuse() {

    }

    public String name() { return this.name; }

    public Itemuse name(final String xName) {
        this.name = xName;
        return this;
    }

    // damage
    public int attack() {
        return this.damage;
    }

    public Itemuse attack(final int power) {
        this.damage = power;
        return this;
    }

}