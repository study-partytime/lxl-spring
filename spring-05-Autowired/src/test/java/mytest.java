import com.dida.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName mytest
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/12
 * @Version 1.0
 **/
public class mytest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();

    }



}
