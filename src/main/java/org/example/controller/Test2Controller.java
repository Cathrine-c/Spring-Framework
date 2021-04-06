package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test2")
//用postman抓包看
@ResponseBody
public class Test2Controller {

    @RequestMapping("/1")
    public Object t1(){
        Map<String,String> map = new HashMap<>();
        map.put("宋江","1");
        map.put("吴用","2");

        return map;

    }
}
