import com.dida.confiig.didaconfig;
import com.dida.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Mytest
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/12
 * @Version 1.0
 **/
public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(didaconfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
