package com.atguigu.sping5.dao;

import org.springframework.stereotype.Component;

@Component(value="userDaoImpl")
public class UserDaoImpl implements UserDao{


    @Override
    public void add() {
        System.out.println("dao  add");
    }
}
