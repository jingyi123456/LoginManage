package com.yunsu.web;

import com.yunsu.domain.Register;
import com.yunsu.service.RegisterUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegisterController {

    @Resource
    private RegisterUserService registerUserService;

    public void setRegisterUserService(RegisterUserService registerUserService) {
        this.registerUserService = registerUserService;
    }

    @RequestMapping("/first")
    public String fisrt(){
        return "login";
    }

    @RequestMapping("insertUser")
    public String insertUser(){
        return "regPage";
    }

    @RequestMapping("findUserByName")
    public String findUserByName(Register register){
        System.out.println(register.getUname());
        Register reg = registerUserService.findUserByName(register.getUname());
        if(register.getUpassword().equals(reg.getUpassword())){
            return "home";
        }
       return "login";
    }

    @RequestMapping("RegSuc")
    public String RegSuc(Register register){
        registerUserService.insertUser(register);
        return "success";
    }
}
