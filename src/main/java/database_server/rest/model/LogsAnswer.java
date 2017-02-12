package database_server.rest.model;

import database_server.database.entities.LogEntry;

import java.util.List;

/**
 * Created by codewing on 28.11.2016.
 */
public class LogsAnswer extends SimpleAnswer {

    private List<LogEntry> logEntries;

    public LogsAnswer(boolean success, String message, List<LogEntry> logEntries) {
        super(success, message);
        this.logEntries = logEntries;
    }

    public List<LogEntry> getLogEntries() {
        return logEntries;
    }

    public void setLogEntries(List<LogEntry> logEntries) {
        this.logEntries = logEntries;
    }
}
