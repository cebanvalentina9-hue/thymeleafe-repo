package pixel.academy.thymeleaf_app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class DemoController {

    //aici vom creea mapping-ul pentru "/hello
    @GetMapping("/hello")
    public String sayHello(Model theModel){
        theModel.addAttribute("TheDate", java.time.LocalDateTime.now());
        return "heloworld";
    }

}
