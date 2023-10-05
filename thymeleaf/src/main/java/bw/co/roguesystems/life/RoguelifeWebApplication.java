package bw.co.roguesystems.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SharedAutoConfiguration.class)
public class RoguelifeWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoguelifeWebApplication.class, args);
    }
}