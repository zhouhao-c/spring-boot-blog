package com.chinasoft.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ListController {

    @GetMapping("/list")
    public String list(){
        return "blogs";
    }
}
