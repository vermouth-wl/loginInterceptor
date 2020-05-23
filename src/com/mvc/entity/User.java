package com.mvc.entity;

/**
 * @Classname User
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-17 09:48
 * @Version 1.0
 **/
public class User {
    private String loginName;
    private String username;
    private String password;
    private String email;
    private String phone;

    public User() {
    }

    public User(String loginName, String username, String password, String email, String phone) {
        this.loginName = loginName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
