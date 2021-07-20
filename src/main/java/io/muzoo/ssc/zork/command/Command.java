package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Main;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.World;

import java.util.List;

public interface Command {
    void execute(String[] args, Main.Status state, Player player, World world);

    int numArgs();

    String getCommand();

    void execute(Game game, List<String> args);
}
