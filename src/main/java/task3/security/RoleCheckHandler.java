package task3.security;

public class RoleCheckHandler extends Handler {
    @Override
    public void handle(String username, String password) {
        if (!"admin".equals(username)) {
            System.out.println("Ошибка: Доступ разрешен только администратору.");
            return;
        }
        System.out.println("Роль пользователя подтверждена.");
        super.handle(username, password);
    }
}
