package com.kuang.demo2;

//真实对象
public class UserServiceImpl implements UserService {
  public void add() {
    System.out.println("增加一个用户");
  }

  public void delete() {
    System.out.println("删除一个用户");
  }

  public void update() {
    System.out.println("修改一个用户");
  }

  public void query() {
    System.out.println("查询一个用户");
  }

  //1.改动原有的业务代码，在公司中是大忌
}
