package com.atguigu.sping5.TestPag;

import com.atguigu.sping5.Config.SpringConfig;
import com.atguigu.sping5.service.UesrService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMethod {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UesrService uesrService=context.getBean("uesrService", UesrService.class);
        uesrService.add();
    }
    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);//配置文件不一样，所new的类也不一样
        UesrService uesrService=context.getBean("uesrService", UesrService.class);
        uesrService.add();
    }
}