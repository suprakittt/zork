package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Main;

import java.util.List;

public class HelpCommand implements Command {
    /**
     * Help text output.
     */
    private final String helpText = "\n"
            + "===========================\n"
            + "   help - Print out all command.\n"
            + "===========================\n"
            + "   exit - Exit game.\n"
            + "   play {map name} - Load to the map\n"
            + "   load {load saved game} - Load from save file\n"
            + "========================\n"
            + "      In-game Command\n"
            + "========================\n"
            + "   info - Give players information and currently room.\n"
            + "   take {item} - Pick up item.\n"
            + "   drop {item} - Drop an item.\n"
            + "   attack with {item} - Attack with an item.\n"
            + "   go {direction} - Move to ( north, south, east, west ).\n"
            + "   map - map.\n"
            + "   autopilot {file} - Run the game by autopilot mode.\n"
            + "   quit - Exit.\n"
            + "   save {name} - Save game.\n"
            + "========================\n";

    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return null;
    }

    @Override
    public void execute(Game game, List<String> args) {
        System.out.print(helpText);
    }
}
