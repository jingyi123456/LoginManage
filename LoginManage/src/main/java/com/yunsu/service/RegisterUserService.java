package com.yunsu.service;

import com.yunsu.domain.Register;

import javax.annotation.Resource;


public interface RegisterUserService {
    public void insertUser(Register reg);

    public Register findUserByName(String name);
}
