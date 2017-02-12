package database_server.rest.model;

import java.util.List;

/**
 * Created by codewing on 28.11.2016.
 */
public class StringAnswer extends SimpleAnswer {

    private List<String> strings;

    public StringAnswer(boolean success, String message, List<String> strings) {
        super(success, message);
        this.strings = strings;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
