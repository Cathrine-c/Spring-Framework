package org.example;

import org.example.config.AppConfig;
import org.example.controller.LoginController;
import org.example.model.ByFactoryBean;
import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        //根据Spring配置文件路径创建容器：应用上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        LoginController loginController = (LoginController) context.getBean("loginController");//拿到loginController类

//        System.out.println(loginController);

        //验证loginController依赖注入的loginService是否为容器中的Bean对象
        LoginService loginService = context.getBean(LoginService.class);
//        System.out.println(loginController.getLoginService()==loginService);
//        System.out.println(loginService.getLoginRepository());


//        User user1 = (User) context.getBean("user1");
//        System.out.println(user1);
//        User user2 = (User) context.getBean("user2");
//        System.out.println(user2);

        //演示错误，同一个类型注册多个bean对象到容器中，不能够使用类型获取，只能通过id获取
//        User user = context.getBean(User.class);
//        System.out.println(user);

//        AppConfig appConfig = context.getBean(AppConfig.class);
//        System.out.println(appConfig);

//
//        User user = (User) context.getBean("byfactoryBean");
//        System.out.println(user);


        User user3 = (User) context.getBean("user3");
        System.out.println(user3);



        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();


    }
}