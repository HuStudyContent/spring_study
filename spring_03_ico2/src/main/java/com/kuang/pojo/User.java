package com.kuang.pojo;

public class User {

  private String name;

  //必须写一个有参构造才能把这个无参构造干掉
  public User(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void show(){
    System.out.println("name="+name);
  }


}
