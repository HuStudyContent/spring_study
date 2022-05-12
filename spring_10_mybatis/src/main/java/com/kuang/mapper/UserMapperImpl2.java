package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

  public List<User> selectUser() {
    //完整写法
//    SqlSession sqlSession = getSqlSession();
//    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//    return mapper.selectUser();

    //简写
    return getSqlSession().getMapper(UserMapper.class).selectUser();
  }
}
