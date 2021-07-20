package io.muzoo.ssc.zork.map;

import io.muzoo.ssc.zork.Stateless;
import io.muzoo.ssc.zork.World;
import io.muzoo.ssc.zork.weapon.Gun;
import io.muzoo.ssc.zork.weapon.Knife;

public class Start extends Map<Stateless> {
    public Start(final World world){
        super(world);
        this.title("New Room")
                .addItem(new Gun())
                .addItem(new Knife());

    }

}
