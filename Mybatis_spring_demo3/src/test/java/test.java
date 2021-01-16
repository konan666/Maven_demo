
import neusoft.domain.Account;
import neusoft.service.IAccoutService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author ：konan
 * @date ：2020/9/5 14:10
 */
public class test {
    @Test
    public void testfindAll() throws SQLException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        IAccoutService as= ac.getBean("IAcconutServiceImpl",IAccoutService.class);
        Account account=new Account();
//        account.setName("13");
//        account.setMoney((float) 123.0);
//        account.setId(4);
        as.delete(2);
    }
}
