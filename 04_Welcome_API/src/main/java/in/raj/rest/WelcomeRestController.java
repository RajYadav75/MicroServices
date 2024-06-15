package in.raj.rest;

import in.raj.feign.GreetFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeRestController {
    @Autowired
    private GreetFeignClient greetFeignClient;
    @GetMapping("/welcome")
    public String getWelcomeMsg() {
       /*
       // This is not recommended
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> forEntity = rt.getForEntity("http://localhost:8081/greet", String.class);
        String greetResp = forEntity.getBody();
        return  greetResp+ " Welcome to the Raj Universe";
        */

        String greetResp = greetFeignClient.invokeGreetApi();
        return greetResp+ ", Welcome to the Raj Universe";
    }
}
