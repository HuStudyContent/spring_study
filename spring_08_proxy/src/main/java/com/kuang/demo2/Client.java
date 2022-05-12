package com.kuang.demo2;

public class Client {
  public static void main(String[] args) {
    UserServiceImpl userService = new UserServiceImpl();


    //通过代理实现了增删改查和日志功能
    UserServiceProxy proxy = new UserServiceProxy();
    proxy.setUserService(userService);

    proxy.add();
  }
}
