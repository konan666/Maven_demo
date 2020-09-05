package Test;

import com.neusoft.domain.Account;
import com.neusoft.service.IAccoutService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 14:10
 */
public class test {
    @Test
    public void testfindAll() throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        IAccoutService as= ac.getBean("acconutService",IAccoutService.class);
        Account account=new Account();
//        account.setName("13");
//        account.setMoney((float) 123.0);
//        account.setId(4);
        as.delete(4);
    }
    public void twqeq() throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        IAccoutService as= ac.getBean("acconutService",IAccoutService.class);
        Account account=as.findAllById(1);
        System.out.println(account);

    }
}
