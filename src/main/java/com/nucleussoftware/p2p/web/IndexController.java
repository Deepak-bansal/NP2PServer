package com.nucleussoftware.p2p.web;

import com.nucleussoftware.p2p.domain.User;
import com.nucleussoftware.p2p.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showIndex(Model model) {
        List<User> userList = userService.loadAll();

        model.addAttribute("userList", userList);

        return "index"; // return index.html Template
    }
}
