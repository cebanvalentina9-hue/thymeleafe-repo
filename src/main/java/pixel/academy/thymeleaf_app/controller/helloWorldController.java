package pixel.academy.thymeleaf_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloWorldController {

    //metoda pentru a afisa formularul HTML initioal

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    //metoda care se ocupa de procesarea datelor din formularul HTML
    @GetMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
    @RequestMapping("/greeting")
    public String generateGreeting(HttpServerRequest request, Model model) {

        //retrieve the request param from HTML
        StringtheName = request.getParameter("StudentName");

        //transform the input to uppercase
        theName = theName.toUpperCase();

        //buid the reponse message
        String result = "Welcome, " + theName;

        //add the message to the model
        model.addAttribute
         return "helloworld";

    }
}
