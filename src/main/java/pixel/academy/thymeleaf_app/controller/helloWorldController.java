package pixel.academy.thymeleaf_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloWorldController {

    //metoda pentru a afisa formularul HTML initioal

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

}
