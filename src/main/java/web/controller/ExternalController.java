package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;

import java.util.List;

@Controller
public class ExternalController {

    @GetMapping("/")
    public String showUsers() {
        return "index";
    }
}
