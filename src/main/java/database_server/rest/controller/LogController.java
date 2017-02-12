package database_server.rest.controller;

import database_server.database.dao.LogEntryDao;
import database_server.database.dao.TxtDataDao;
import database_server.database.entities.LogEntry;
import database_server.rest.model.LogsAnswer;
import database_server.rest.model.SimpleAnswer;
import database_server.rest.model.StringAnswer;
import database_server.rest.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by codewing on 28.11.2016.
 */

@RestController
public class LogController {

    @Autowired
    private LogEntryDao logRepository;

    @Autowired
    private TxtDataDao txtDataRepository;

    public static <E> List<E> makeCollection(Iterable<E> it) {
        List<E> list = new ArrayList<>();
        for (E item : it) {
            list.add(item);
        }
        return list;
    }

    @RequestMapping(value = "/log/add", method = RequestMethod.POST)
    public SimpleAnswer addLog(@RequestBody LogEntry logEntry) {
        txtDataRepository.save(logEntry.getTxtDataList());
        logRepository.save(logEntry);

        return new SimpleAnswer(true, String.format(Utils.FORMAT_ISD, logEntry.getInstance(), logEntry.getService(), logEntry.getDomain()) + " was added successfully");
    }

    @RequestMapping(value = "/log/get", method = RequestMethod.GET)
    public LogsAnswer getAllLogs() {
        return new LogsAnswer(true, "All logs added", makeCollection(logRepository.findAll()));
    }

    @RequestMapping(value = "/log/getOrigins", method = RequestMethod.GET)
    public StringAnswer getAllOrigins() {
        List<LogEntry> logs = makeCollection(logRepository.findAll());
        List<String> origins = logs.parallelStream().map(logEntry -> logEntry.getOrigin()).distinct().collect(Collectors.toList());
        return new StringAnswer(true, "All origins added", origins);
    }

    @RequestMapping(value = "/log/getByOrigin", method = RequestMethod.GET)
    public LogsAnswer getByOrigin(@RequestParam(value = "origin") String origin) {
        return new LogsAnswer(true, "All logs added", makeCollection(logRepository.findByOrigin(origin)));
    }
}
