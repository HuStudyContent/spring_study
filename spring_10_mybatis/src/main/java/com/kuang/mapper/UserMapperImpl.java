package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

  //我们的所有操作都使用sqlSession来执行， 在原来， 现在我们都使用sqlSessionFactory
  private SqlSessionTemplate sqlSession;

  public void setSqlSession(SqlSessionTemplate sqlSession) {
    this.sqlSession = sqlSession;
  }

  public List<User> selectUser(){
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    return mapper.selectUser();
  }
}
