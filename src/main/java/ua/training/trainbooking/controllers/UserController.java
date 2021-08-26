package ua.training.trainbooking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.training.trainbooking.services.UserService;

/**
 * @author Kozka Ivan
 */
@Controller
@RequestMapping("/users")
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUsers(Model model) {
        //TODO: get all users from DB and put in model
        model.addAttribute("users", null);
        return "users";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Integer id, Model model) {
        //TODO: get user by id from DB and put in model
        model.addAttribute("user", null);
        return "user";
    }

    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable("id") Integer id, Model model) {
        //TODO: get user by id from DB and put in model
        model.addAttribute("user", null);
        return "edit";
    }

    @PostMapping
    public String createUser() {
        //TODO: get user from view, validate, check and if all OK add in DB or throw Exc
        return "users";
    }

    @PatchMapping
    public String modifyUser() {
        //TODO: get modified user from view, validate, check
        // and if all OK replace in DB or throw Exc
        return "users";
    }

    @DeleteMapping
    public String deleteUser() {
        //TODO: delete user
        return "users";
    }
}
