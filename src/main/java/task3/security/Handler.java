package task3.security;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }
    public void handle(String username, String password) {
        if (next != null) {
            next.handle(username, password);
        }
    }
}
