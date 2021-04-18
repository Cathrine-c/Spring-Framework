package org.example.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
@Slf4j
public class ResponseAdvice implements ResponseBodyAdvice<Object> {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }


    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        Response resp = null;

        //如果Controller请求映射方法返回值本身就是统一数据类型就不要包裹
        if (body instanceof Response){
            resp = (Response) body;

        }else {
            resp = new Response();
            resp.setOk(true);
            resp.setData(body);

        }

        if (body instanceof String){
            try {
                response.getHeaders().setContentType(MediaType.APPLICATION_JSON);

                return objectMapper.writeValueAsString(resp);
            } catch (JsonProcessingException e) {
                //e.printStackTrace();
                log.error("序列化响应数据失败",e);
            }
        }

        return resp;

    }


}
