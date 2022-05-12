package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {

  @Resource
  private Cat cat;

  @Autowired
//  @Qualifier(value = "dog2")
  @Resource(name = "dog2")
  private Dog dog;
  private String name;

  public Cat getCat() {
    return cat;
  }

  public Dog getDog() {
    return dog;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "People{" +
            "cat=" + cat +
            ", dog=" + dog +
            ", name='" + name + '\'' +
            '}';
  }
}
