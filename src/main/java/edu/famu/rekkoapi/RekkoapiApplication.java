package edu.famu.rekkoapi;

import edu.famu.rekkoapi.models.parse.Friends;
import edu.famu.rekkoapi.models.parse.Post;
import edu.famu.rekkoapi.models.parse.User;
import io.github.cdimascio.dotenv.Dotenv;
import org.parse4j.Parse;
import org.parse4j.util.ParseRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RekkoapiApplication {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.configure().filename("env").load();
        ParseRegistry.registerSubclass(Friends.class);
        ParseRegistry.registerSubclass(Post.class);
        ParseRegistry.registerSubclass(User.class);
        Parse.initialize(dotenv.get("PARSE_APP_ID"), dotenv.get("PARSE_REST_ID"));
        SpringApplication.run(RekkoapiApplication.class, args);

    }

}
