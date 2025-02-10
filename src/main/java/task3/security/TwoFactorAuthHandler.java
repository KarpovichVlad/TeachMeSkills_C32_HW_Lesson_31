package task3.security;

import java.util.Scanner;

public class TwoFactorAuthHandler extends Handler{
    @Override
    public void handle(String username, String password) {
        System.out.print("Введите код подтверждения : ");
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        if (!"admin".equals(code)) {
            System.out.println("Ошибка: Неверный код подтверждения!");
            return;
        }
        System.out.println("Двухфакторная аутентификация пройдена.");
        super.handle(username, password);
    }

}
