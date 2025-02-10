package task3;

import task3.security.Handler;
import task3.security.LoginHandler;
import task3.security.RoleCheckHandler;
import task3.security.TwoFactorAuthHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Handler handler = new LoginHandler();
        handler.setNext(new RoleCheckHandler())
                .setNext(new TwoFactorAuthHandler());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        handler.handle(username, password);

        scanner.close();
    }
}
