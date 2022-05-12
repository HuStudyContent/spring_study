import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4 {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Student student = (Student) context.getBean("student");
    System.out.println(student.toString());
  }

//  Student{
//  name='胡学军',
//  address=Address{address='江西'},
//  books=[三国演义, 红楼梦, 水浒传, 西游记],
//  hobbys=[羽毛球, 听歌, 看电影],
//  card={身份证=12323123365448, 银行卡=12323123879456},
//  games=[LOL, COC, BOB],
//  wife='null',
//  info={学号=203601607,
//  性别=男,
//  姓名=huxuejun}}

  @Test
  public void test2(){
    ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
    User user = (User)context.getBean("user");
//    User user = context.getBean("user", User.class); 可以不用使用强转
    User user2 = (User)context.getBean("user2");
    System.out.println(user.toString());
    System.out.println(user2.toString());

    System.out.println(user == user2);
  }

  @Test
  public void test3(){
    ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
    User user2 = (User)context.getBean("user2");
    User user3 = (User)context.getBean("user2");

    System.out.println(user3 == user2);
  }


}
