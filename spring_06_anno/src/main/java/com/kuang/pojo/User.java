package com.kuang.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="com.kaung.pojo"/>
// @Component 组件


@Component
@Scope("prototype")
public class User {

//  @Value("狂神")
  public String name ;

  //相当于 <property name="name" value="胡学军"/>
  @Value("胡学军")
  public void setName(String name){
    this.name = name;
  }

}
