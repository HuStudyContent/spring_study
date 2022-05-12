package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   //这个也会注册到容器中，因为这个本来就是一个component
//  @Configuration 代表是一个配置类，和之前的bean.xml文件一样
@ComponentScan("com.kuang.pojo")
public class KuangConfig {

  //注册一个bean,就相当于我们之前写的一个bean标签
  //这个方法的名字，就相当于bean标签的id属性
  //这个方法的返回值， 就相当于bean标签的class属性
  @Bean
  public User getUser(){
    return new User();    //就是返回要注入到bean的对象
  }
}
