package postgressqltest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import postgressqltest.demo.entity.User;
import postgressqltest.demo.service.UserService;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String registry() {
        return "registry";
    }

    @PostMapping("/saveUser")
    public String saveUser(User user) {
        if (user == null) {
            System.out.println("Null");
        } else {
            userService.create(user);
        }
        return "redirect:/login";
    }

    @PostMapping("/successURL")
    public String successURL() {
        return "index";
    }
}
