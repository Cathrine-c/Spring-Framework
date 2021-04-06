package org.example.controller;

import org.example.exception.AppException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex")
public class ExceptionController {

    @GetMapping("/1")
    public Object ex1(){
        int i = 1;
        int x = i/0;
        return new Object();
    }

    @GetMapping("/2")
    public Object ex2(){
        throw new AppException("ex2", "数据库出错了");
    }
}
