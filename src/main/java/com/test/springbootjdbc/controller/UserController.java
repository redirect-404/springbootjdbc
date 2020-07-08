package com.test.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;

@Controller
public class UserController {

    @Autowired
    private DataSource DataSource;

    @GetMapping("/show")
    public String getPage(){
        return "ok";
    }

}
