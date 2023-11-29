package gcphelloworld.se.nilden;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nilden")
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
