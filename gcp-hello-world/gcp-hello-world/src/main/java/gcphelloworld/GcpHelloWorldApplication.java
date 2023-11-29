package gcphelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GcpHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(GcpHelloWorldApplication.class, args);
        System.out.println("Starting Hello World Application!");

    }

}
