import com.dida.pojo.Student;
import com.dida.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Mytest
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/9
 * @Version 1.0
 **/
public class Mytest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println(student.toString());

        ApplicationContext contexts = new ClassPathXmlApplicationContext("application.xml");
        User user = contexts.getBean("user2", User.class);
        System.out.printf(user.getName());


        User user1 = contexts.getBean("user", User.class);
        User user2 = contexts.getBean("user", User.class);

        System.out.println(user1 == user2);

    }
}
