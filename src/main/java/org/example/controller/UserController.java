package org.example.controller;

import org.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

@Controller
@RequestMapping("/user")
public class UserController {


    //注明服务方法提供的是Post方法，如果是多个就用大括号圈起来
    @RequestMapping(value = "/login",
            method = {RequestMethod.POST})
    public String login(){

        return "redirect:/index.html";

    }


    @RequestMapping("/XX")
    @ResponseBody
    public String XX(){
        return "/login";

    }


    @RequestMapping("/t1")
    @ResponseBody
    public Object t1(){
        Map<String,String> map = new HashMap<>();
        map.put("1","宋江");
        map.put("2","吴用");

        return map;

    }


    @RequestMapping("/query/{id}")//花括号内的id跟下面参数id同名
    @ResponseBody

    //尽量避免使用基础数据类型
    public Object t2(@PathVariable Integer id){
        Map<String,String> map = new HashMap<>();
        map.put("1","宋江"+id);
        map.put("2","吴用");

        return map;
    }


    @RequestMapping("/login2")
    @ResponseBody
    public Object login2(@RequestParam String username,
                         @RequestParam String password,
                         @RequestParam(required = false) Integer i,
                         @RequestParam(required = false) MultipartFile f){
        //上传文件保存到服务端某个路径
//        f.transferTo(new File(""));
        Map<String,String> map = new HashMap<>();
        map.put("1",username);
        map.put("2",password);
        return map;

    }


    @RequestMapping("/login3")
    @ResponseBody
    //请求数据比较多，就使用对象，数据比较少就使用变量
    public Object login3(User user){
        return user;
    }


    @RequestMapping("/login4")
    @ResponseBody
    public Object login4(@RequestBody User user, HttpServletRequest req ){
        Map<String,Object> map = new HashMap<>();
        if ("abc".equals(user.getUsername())&&"123".equals(user.getPassword())){
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            map.put("ok",true);
            map.put("msg","登录成功");
        }else {
            map.put("ok",false);
            map.put("msg","用户名或密码错误");
        }

        return user;

    }
}
