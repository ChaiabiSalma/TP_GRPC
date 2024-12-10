package ma.projet.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Grpc2Application {
    public static void main(String[] args) {
        SpringApplication.run(Grpc2Application.class, args);
        System.out.println("GRPC Server should be running on port 9090...");
    }
}

