package in.raj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
    @GetMapping("/greet")
    public String getGreetMsg(){
        return "Good Morning";
    }
}
