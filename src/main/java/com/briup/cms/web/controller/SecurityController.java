package com.briup.cms.web.controller;

import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;


@RestController
@ApiIgnore
public class SecurityController {

    @GetMapping ("/authenticaion/login")
    public Message logg(){
        return MessageUtil.error(403,"登陆失败，请重新登录");
    }
    }