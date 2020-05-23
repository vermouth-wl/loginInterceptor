package com.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname LoginInterceptor
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-24 01:05
 * @Version 1.0
 **/
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception{
        // 获取请求的url
        String url = request.getRequestURI();
        // 如果url中没有包含login相关内容, 执行
        if (!(url.contains("Login") || url.contains("login"))){
            // 非登录请求,检查session是否有用户数据
            if (request.getSession().getAttribute("CURRENT_USER") != null) {
                return true; // 包含用户数据，说明已经登录
            } else { // session未包含用户数据
                request.setAttribute("message", "你还没有登录，请先进行登录");
                request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
            }
        } else {
            return true; // 包含的是登录请求,放行
        }
            return false;  // 默认拦截
    }
}
