package ua.training.trainbooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kozka Ivan
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
