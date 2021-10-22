import com.dida.dao.UserDaoMysqlImpl;
import com.dida.service.UserService;
import com.dida.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
//
//        UserService userService = new UserServiceImpl() ;
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl UserServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        UserServiceImpl.getUser();
    }
}
