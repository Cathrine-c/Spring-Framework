package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //==@Controller+@ResponseBody
@RequestMapping("/test3")
public class Test3Controller {

    @GetMapping("/1")
    public String t1(){
        return "rest/1";
    }
}
