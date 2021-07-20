package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.World;

import java.util.List;

public class ExitCommand implements Command {
    String exitText =
            "========================\n"
                    + "  Thank you for playing, BYE!!!\n"
                    + "========================";

    String errorText =
            "==============================\n"
                    + "Can't use this command\n"
                    + "==============================\n";

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

    }

    @Override
    public void execute(final String[] args, final Main.Status state, Player player, World world) {
        if (state.equals(Main.Status.MENU)) {
            System.out.println(exitText);
            System.exit(0);
        } else {
            System.out.println(errorText);
        }
    }
}