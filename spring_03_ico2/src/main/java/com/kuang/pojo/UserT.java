package com.kuang.pojo;

public class UserT {

  private String hobbys;

  public UserT(){
    System.out.println("UserT对象被创建");
  }

  public String getHobbys() {
    return hobbys;
  }

  public void setHobbys(String hobbys) {
    this.hobbys = hobbys;
  }

  public void shows(){
    System.out.println("hobbys是"+hobbys);
  }
}
