package com.dreamer.spring6.aop.annoaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {


    @Test
    public void TestInsert(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        Operator operator = context.getBean(Operator.class);
        operator.select(123);
    }
}
