package org.example.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppException extends RuntimeException{

    /**
     * 错误码
     */
    private String code;


    public AppException( String code,String message) {
        super(message);
        this.code= code;
    }

    protected AppException( String code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}



