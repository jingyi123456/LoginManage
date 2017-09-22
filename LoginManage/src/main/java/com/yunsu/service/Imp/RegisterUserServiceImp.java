package com.yunsu.service.Imp;

import com.yunsu.dao.RegisterUserDao;
import com.yunsu.domain.Register;
import com.yunsu.service.RegisterUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterUserServiceImp implements RegisterUserService{

    @Resource
    private RegisterUserDao registerUserDao;

    public void setRegisterUserDao(RegisterUserDao registerUserDao) {
        this.registerUserDao = registerUserDao;
    }

    @Override
    public void insertUser(Register reg) {
        registerUserDao.insertRegisterUser(reg);
    }

    @Override
    public Register findUserByName(String name) {
        return registerUserDao.findUserByName(name);
    }
}
