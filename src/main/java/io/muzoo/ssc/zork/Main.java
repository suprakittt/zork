package io.muzoo.ssc.zork;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      Game game = new Game();
      game.run();
    }

    public enum Status {
        PLAYING, WIN, DIE, MENU
    }

    public static final Map<String, World.Direction> dirShorthand = Main.dirShorthand();

    private static Map<String, World.Direction> dirShorthand() {
        final Map<String, World.Direction> map = new HashMap<>();
        map.put("north", World.Direction.NORTH);
        map.put("east", World.Direction.EAST);
        map.put("south", World.Direction.SOUTH);
        map.put("west", World.Direction.WEST);
        return map;
    }

}
