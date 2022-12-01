package db;

public class DbIntergrityException extends RuntimeException {

    public DbIntergrityException(String msg) {
        super(msg);
    }
}
