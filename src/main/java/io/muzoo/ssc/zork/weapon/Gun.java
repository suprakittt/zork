package io.muzoo.ssc.zork.weapon;

import io.muzoo.ssc.zork.Itemuse;

public class Gun extends Itemuse {
    public Gun(){
        super();
        this.name("Gun").attack(20);
    }
}