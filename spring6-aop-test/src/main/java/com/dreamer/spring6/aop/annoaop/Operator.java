package com.dreamer.spring6.aop.annoaop;

public interface Operator {

    void insert(String str);

    boolean delete(int id);

    boolean update(int id, String str);

    String select(int id);

}
