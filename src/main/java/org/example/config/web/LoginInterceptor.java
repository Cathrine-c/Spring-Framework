package org.example.config.web;

import org.example.model.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("user");

            //说明已经登录过了
            if (user != null) {
                return true;
            }
        }

        //为了避免返回200，因为是敏感资源不能访问，返回401表示客户端错误
        response.setStatus(401);
        return false;
    }
}
