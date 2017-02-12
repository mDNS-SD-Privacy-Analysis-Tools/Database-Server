package database_server.rest.model;

/**
 * Created by codewing on 28.11.2016.
 */
public class SimpleAnswer {

    private final boolean success;
    private final String message;

    public SimpleAnswer(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
