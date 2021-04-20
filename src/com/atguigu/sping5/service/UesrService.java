package com.atguigu.sping5.service;


import com.atguigu.sping5.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//在注解里面 value 属性值可以省略不写，
//默认值是类名称，首字母小写
//UserService -- userService
@Service  //<bean id="userService" class=".."/>
public class UesrService {

    @Value("abc")//注入普通类型属性
    private String name;
    //定义 dao 类型属性
    //不需要添加 set 方法
    //添加注入属性注解
    //@Autowired//根据属性类型注入
    //@Qualifier(value = "userDaoImpl")//根据属性名称注入，使用时和Autowired一起使用
    @Resource(name = "userDaoImpl")//可以根据类型注入，可以根据名称注入,区别在于后边是否带参数
    private UserDao userDao;

    public void add()
    {
        userDao.add();
        System.out.println("Service add  "+name);
    }
}
