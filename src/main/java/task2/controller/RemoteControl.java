package task2.controller;

import task2.commands.Command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private final Map<String, Command> commands = new HashMap<>();

    public void addCommand(String name, Command command) {
        commands.put(name.toLowerCase(), command);
    }

    public void executeCommand(String name) {
        Command command = commands.get(name.toLowerCase());
        if (command != null) {
            command.execute();
        }else {
            System.out.println("Неизвестная команда: " + name);
        }
    }
}
