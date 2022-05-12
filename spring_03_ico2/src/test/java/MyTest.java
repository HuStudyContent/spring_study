import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // 在使用getBean 创建了user
//    User user = (User)context.getBean("newUser");
//    user.show();

    UserT userT = (UserT)context.getBean("user2");
    userT.shows();
  }
}
