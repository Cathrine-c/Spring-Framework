package org.example.config;

import lombok.extern.slf4j.Slf4j;
import org.example.exception.AppException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;



@ControllerAdvice
//打印日志的注解
@Slf4j

public class ExceptionAdvice {

    @ExceptionHandler(AppException.class)
    @ResponseBody
    public Object handle(AppException e){
        //打印log日志

        Map<String, Object> map = new HashMap<>();
        map.put("ok", false);
        map.put("code", e.getCode());
        map.put("msg", e.getMessage());
        return map;
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handle(Exception e){

        Map<String, Object> map = new HashMap<>();
        map.put("ok", false);
        map.put("code", "ERR000");
        map.put("msg", "未知错误，请联系管理员");
        return map;

    }
}
