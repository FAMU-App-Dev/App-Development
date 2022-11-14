package edu.famu.rekkoapi;

import org.parse4j.Parse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RekkoapiApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.configure().filename("env").load();
        Parse.initialize(dotenv.get("PARSE_APP_ID"), dotenv.get("PARSE_REST_ID"));
        SpringApplication.run(RekkoapiApplication.class, args);

    }

}
