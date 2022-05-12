import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
  public static void main(String[] args) {
    ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
    UserMapper mapper = context.getBean("userMapper", UserMapper.class);

    List<User> userList = mapper.selectUser();

    for (User user : userList) {
      System.out.println(user);
    }
  }
}
