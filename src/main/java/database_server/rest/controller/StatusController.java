package database_server.rest.controller;

import database_server.rest.model.SimpleAnswer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by codewing on 28.11.2016.
 */

@RestController
public class StatusController {


    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public SimpleAnswer getStatus() {
        return new SimpleAnswer(true, "Server up and running!");
    }
}
