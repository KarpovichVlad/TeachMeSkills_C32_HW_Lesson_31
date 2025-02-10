package task2;

import task2.commands.fan.FanOffCommand;
import task2.commands.fan.FanOnCommand;
import task2.commands.light.LightOffCommand;
import task2.commands.light.LightOnCommand;
import task2.controller.RemoteControl;
import task2.devices.Fan;
import task2.devices.Light;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        Fan fan = new Fan();

        remote.addCommand("включить свет", new LightOnCommand(light));
        remote.addCommand("выключить свет", new LightOffCommand(light));
        remote.addCommand("включить вентилятор", new FanOnCommand(fan));
        remote.addCommand("выключить вентилятор", new FanOffCommand(fan));

        System.out.println("Введите команду (например, 'включить свет' или 'выключить вентилятор'). Введите 'выход' для завершения.");

        while (true) {
            System.out.print(">");
            String command = sc.nextLine().trim();

            if(command.equalsIgnoreCase("выход")){
                System.out.println("Завершение работы");
                break;
            }
            remote.executeCommand(command);
        }
        sc.close();
    }
}
