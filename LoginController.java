package org.example.controller;



import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
/*
四个注解对象到Bean容器中：service、repository、controlller、component


 */

@Controller//注册一个id为类名首字母小写，为bean对象
public class LoginController {


    //注解
    @Autowired
    private LoginService loginService;

    public LoginService getLoginService() {
        return loginService;
    }

    @Autowired
    private User user1;


    @Autowired
    @Qualifier("user2")
    private User U;


    @Bean
    public User user1(){
        User user1 = new User();
        user1.setUsername("丫丫");
        user1.setPassword("123");
        return user1;

    }

    @Bean
    public User user2(){
        User user2 = new User();
        user2.setUsername("猪猪");
        user2.setPassword("2021314");
        return user2;

    }

    @Bean
    public User user3(User user2){
        System.out.println(user2);

        User user3 = new User();
        user3.setUsername("wefdd");
        user3.setPassword("0000");
        return user3;
    }



}
