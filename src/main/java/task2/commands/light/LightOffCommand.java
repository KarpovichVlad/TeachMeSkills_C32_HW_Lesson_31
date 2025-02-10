package task2.commands.light;

import task2.commands.Command;
import task2.devices.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();

    }

    @Override
    public void undo() {
        light.turnOn();

    }
}
