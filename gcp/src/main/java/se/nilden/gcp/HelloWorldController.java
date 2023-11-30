package se.nilden.gcp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/")
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
        public String helloWorld() {
            return "Hello there!";
        }
}
