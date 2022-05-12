package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.session.SqlSession;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

  public List<User> selectUser(){

    User user = new User(8,"赵今麦妹妹","123456");
    addUser(user);  //增加
    deleteUser(7);  //删除

    return getSqlSession().getMapper(UserMapper.class).selectUser();
  }

  public int addUser(User user) {
    return getSqlSession().getMapper(UserMapper.class).addUser(user);
  }

  public int deleteUser(int id) {
    return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
  }
}
