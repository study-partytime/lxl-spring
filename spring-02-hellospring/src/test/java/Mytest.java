import com.dida.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {

        //使用xml加载要写这句话来获取spring的上下文对象，可以传入多个
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");

        System.out.println(hello.getName());
    }
}
