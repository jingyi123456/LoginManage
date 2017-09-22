package com.yunsu.dao;

import com.yunsu.domain.Register;
import org.springframework.stereotype.Repository;

@Repository
public interface  RegisterUserDao {
    public void insertRegisterUser(Register reg);

    public Register findUserByName(String name);
}
