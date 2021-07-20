package io.muzoo.ssc.zork.ingame;

import io.muzoo.ssc.zork.*;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class Drop implements Command {

    String errorText = "Can not use this command";

    @Override
    public void execute(final String[] args, final Main.Status state, Player player, World world) {
        if (state.equals(Main.Status.PLAYING)) {
            Itemuse item = new Itemuse().name(args[2]);
            if (item != null){
                player.deleteItem(item);
                world.getMap(player.getCurrentMap()).addItem(item);
                System.out.println("You drop" + item.name());
            }
        } else {
            System.out.println(errorText);
        }
    }

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
}