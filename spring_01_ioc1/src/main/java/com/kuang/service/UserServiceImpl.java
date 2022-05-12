package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {

  //每多一个实现类就要改变原来的代码
//  private UserDao userDao = new UserDaoImpl();
//  private UserDao userDao = new UserDaoMysqlImpl();
//  private UserDao userDao = new UserDaoOracleImpl();

  private UserDao userDao;

  // 利用set进行动态实现值的注入
  public void setUserDao(UserDao userDao){
    this.userDao = userDao;
  }


  public void getUser(){
    userDao.getUser();
  }
}
