package org.example.controller;


import org.example.model.Response;
import org.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("/1")
    public Object u1(){
        Response r = new Response();
        r.setCode("1");
        return r;
    }


    @GetMapping("/2")
    public Object u2(){
        User u = new User();
        u.setUsername("张三");
        return u;
    }


    @GetMapping("/3")
    public String u3(){
       return "u3";

    }


    @GetMapping("/4")
    public String u4(){
        return null;

    }

    @GetMapping("/5")
    public Object u5(){
        return null;

    }


}
