package com.atguigu.sping5.Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//作为配置类的标识注解，替代XML配置文件
@ComponentScan(basePackages = {"com.atguigu"})
public class SpringConfig {
}
