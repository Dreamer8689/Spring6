package com.dreamer.spring6.aop.annoaop;

import org.springframework.stereotype.Component;

@Component
public class UserOperatorImpl implements Operator {


    @Override
    public void insert(String str) {

        System.out.println("insert user" + str);

    }

    @Override
    public boolean delete(int id) {

        System.out.println("delete user id:" + id);

        return true;
    }

    @Override
    public boolean update(int id, String str) {

        System.out.println("update user id" + id);

        return true;
    }

    @Override
    public String select(int id) {

        System.out.println("select user id" + id);

        return null;
    }
}
