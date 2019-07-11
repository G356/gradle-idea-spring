package com.huayou.controller;

import com.huayou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public String toList(Model model){
       // return "/list";
        String save= userService.toList();
        model.addAttribute("save", save);
        return "/list";
    }
}
