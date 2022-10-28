package com.itgr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration              //配置类
@ComponentScan("com.itgr")  //扫描包
@EnableAspectJAutoProxy     //开启aop注解支持
public class SpringConfig {
}