package org.example.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.HashMap;
import java.util.Map;

//实现ResponseBodyAdvice接口，表示可以根据条件对返回的数据重写
@ControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice {

    //注入容器中的ObjectMapper，SpringBoot默认使用jackson框架中的ObjectMapper完成json的序列化
    @Autowired
    private ObjectMapper objectMapper;

    //方法参数可以获取请求调用的控制器类及方法，再决定是否要执行响应内容重写
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    //响应的内容在返回客户端之前，会执行本方法，重写之后在返回
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //构造一个要重写给客户端的统一数据格式
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        map.put("data", body);
        //如果控制器方法返回类型为字符串，响应的Content-Type为text/plain，手动设置为json，并重写为序列化后的json字符串
        if(body instanceof String){
            try {
                response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
                return objectMapper.writeValueAsString(map);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("json序列化失败");
            }
        }

        return map;
    }
}