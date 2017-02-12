package database_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

/**
 * Created by codewing on 28.11.2016.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("Current time: " + LocalDateTime.now().toString());
        SpringApplication.run(Application.class, args);
    }
}
