import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
  //原来Mybatis写法
//  @Test
//  public void test1() throws IOException {
//    String resources = "mybatis-config.xml";
//    InputStream in = Resources.getResourceAsStream(resources);
//    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
//    SqlSession sqlSession = sqlSessionFactory.openSession(true);
//
//    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//    List<User> userList = mapper.selectUser();
//
//    for(User user : userList){
//      System.out.println(user);
//    }
//  }

  //继承mybatis-spring
  @Test
  public void test2() throws IOException {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
    for (User user : userMapper.selectUser()) {
      System.out.println(user);
    }
  }

  //继承的第二种实现方式
  @Test
  public void test3() throws IOException {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
    for (User user : userMapper.selectUser()) {
      System.out.println(user);
    }
  }
}
