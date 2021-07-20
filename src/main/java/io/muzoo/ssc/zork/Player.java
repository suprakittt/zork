package io.muzoo.ssc.zork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Player {

        private String name;

        private int hp;

        private int maxHp;

        private Map currentArea;

        private List<Itemuse> inventory;

        private Main.Status death;

    public Player(final int hp, final String name) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.death = Main.Status.PLAYING;
        this.inventory = new ArrayList<>();
    }
    public void addItem(final Itemuse item) {
        this.inventory.add(item);
    }

    public void deleteItem(final Itemuse item) {
        this.inventory.remove(item);
    }

    public List<Itemuse> showInventory() {
        return this.inventory;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMaxHp() {
        return this.maxHp;
    }

    public Main.Status getStatus() {
        return this.death;
    }
}


