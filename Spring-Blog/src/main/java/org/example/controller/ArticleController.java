package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")

public class ArticleController {

    @GetMapping("/query")
    public Object query(){
        //如果登录了，需要返回用户信息，及所有文章列表
        
    }
}
