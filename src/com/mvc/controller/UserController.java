package com.mvc.controller;

import com.mvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @Classname UserController
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-17 09:47
 * @Version 1.0
 **/
@Controller
public class UserController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String loginPage(){
        System.out.println("用户从login请求跳转到login.jsp界面");
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession session){
        String loginName = user.getLoginName();
        String password = user.getPassword();
        if (loginName != null && loginName.equals("vermouth") && password != null && password.equals("vermouth")) {
            System.out.println("用户登录功能实现");
            // 将用户信息添加到Session中
            session.setAttribute("CURRENT_USER", user);
            return "redirect:success"; // 重定向到主页面
        }
        model.addAttribute("message", "账号或者密码错误，请重新登录");
        return "login";
    }

    @RequestMapping(value = "/success")
    public String success(){
        System.out.println("用户请求success成功, 访问success页面");
        return "success";
    }

    // 用户注销
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        System.out.println("清除session， 重定向login页面");
        return "redirect:login";
    }
}
