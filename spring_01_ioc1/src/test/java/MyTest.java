import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  public static void main(String[] args) {

    //用户实际调动的是业务层，dao层他们不需要接触
//    UserServiceImpl userService = new UserServiceImpl();
//
//    ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//
//    userService.getUser();


    // 获取ApplicationContext, 拿到spring的容器
    ApplicationContext context = new ClassPathXmlApplicationContext("beans_01.xml");

    // 容器在手，天下我有
    UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");

    userServiceImpl.getUser();

  }
}
