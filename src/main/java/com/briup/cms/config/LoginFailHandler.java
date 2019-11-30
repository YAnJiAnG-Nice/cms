package com.briup.cms.config;

import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFailHandler implements AuthenticationFailureHandler {
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public void onAuthenticationFailure(HttpServletRequest Request, HttpServletResponse Response, AuthenticationException e) throws IOException, ServletException {

        Response.setContentType("application/json;charset = utf-8");
        Message<Object> message = MessageUtil.error(403, "登录失败");

        Response.getWriter().println(objectMapper.writeValueAsString(message));

    }
}
