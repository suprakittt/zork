package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParser {

    private List<String> allCommandsSortedByLength = new ArrayList<>();
    {
        allCommandsSortedByLength.addAll(CommandFactory.getAllCommands());
        allCommandsSortedByLength.sort((o1, o2) -> o2.length() - o1.length());

    }

    private String matchInputToCommand(String input){
        for (String command: allCommandsSortedByLength) {
            if (input.startsWith(command)) {
                return command;
            }
        }
        return null;
    }

    //attack with weapon -> "attack with", "weapon"

    public List<String> parser(String stringInput) {
        String cleanedInput = stringInput.trim();
        String cmd = matchInputToCommand(cleanedInput);
        Command command = CommandFactory.get(cmd);
        if (command.numArgs() > 0) {
            // TODO: do some checking for space latter
            // TODO: handle invalid number of argument

            String argString = cleanedInput.substring(cmd.length() + 1);
            System.out.println(argString);
            return Arrays.asList(cmd, argString);
        } else {
            return Arrays.asList(cmd);
        }
    }
}
