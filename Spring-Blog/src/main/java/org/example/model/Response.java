package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

/**
 * 前后端约定好的统一响应数据格式
 * 前端发送ajax请求后，需要根据该格式来解析
 *
 */

public class Response {

    /**
     * 当前http请求业务操作是否成功
     */
    private boolean ok;

    /**
     * 操作成功时响应的业务数据
     */
    private Object data;

    /**
     * 操作失败时的响应错误码
     */
    private String code;

    /**
     * 操作失败是的响应的错误信息
     *
     */
    private String msg;


    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
