import com.dida.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Mytest
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/18
 * @Version 1.0
 **/
public class Mytest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appllicationContext.xml");
        //动态代理代理的接口
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
