import com.dida.pojo.user;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/9
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.getBean("user");
    }
}
