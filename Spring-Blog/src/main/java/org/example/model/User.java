package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString

/**
 * 用户信息
 */

public class User {

    /**
     * 数据库用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;

    /**
     * 以下是可以添加的内容:用户头像.保持的是uri
     *
     */
    private String head;

    /**
     * 生日
     *
     */
    private Date birthday;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
