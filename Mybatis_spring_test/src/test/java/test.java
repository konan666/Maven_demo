import com.neusoft.domain.User;
import com.neusoft.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/6 8:39
 */
public class test {
    @Test
    public void findall() throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        UserService as = ac.getBean("userServiceImpl", UserService.class);
        List<User> list=as.findAll();
        for(User u:list){
            System.out.println(u);
        }

    }
    @Test
    public void findallbyid() throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        UserService as = ac.getBean("userServiceImpl", UserService.class);
        User u = as.findAllById(45);
        System.out.println(u);

    }
    @Test
    public void insert() throws SQLException {
        User user = new User();
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        UserService as = ac.getBean("userService", UserService.class);
        user.setUsername("123");
        as.delete(49);

    }
}
