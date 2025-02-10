package task3.security;

import java.util.HashMap;
import java.util.Map;

public class LoginHandler extends Handler{
    private final Map<String, String> users = new HashMap<>();

    public LoginHandler(){
        users.put("admin", "admin");
        users.put("user", "user");
    }

    @Override
    public void handle(String username, String password) {
        if(!users.containsKey(username)|| !users.get(username).equals(password)){
            System.out.println("Ошибка: Неверный логин или пароль!");
            return;
        }
        System.out.println("Логин и пароль верны.");
        super.handle(username, password);
    }
}
