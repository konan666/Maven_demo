import neusoft.config.SpringConfiguration;
import neusoft.domain.Account;
import neusoft.domain.Emp;
import neusoft.service.EmpService;
import neusoft.service.IAccoutService;
import neusoft.service.Impl.EmpServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 16:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class test1 {
    @Autowired
    private EmpService as=null;

    @Test
    public void findall() throws SQLException {
        List<Emp> list=as.findAll();
        for(Emp e:list){
            System.out.println(e);
        }
    }
//    @Test
//    public void findallbyid() throws SQLException {
//        Emp emp=as.findAllById(7369);
//        System.out.println(emp);
//    }
//    @Test
//    public void save() throws SQLException {
//        Emp emp = new Emp();
//        emp.setEname("666");
//        as.save(emp);
//
//    }
//    @Test
//    public void update() throws SQLException {
//        Emp emp = new Emp();
//        emp.setEname("666");
//        emp.setEmpno(7934);
//        as.update(emp);
//    }
//    @Test
//    public  void delete() throws SQLException {
//        as.delete(1562);
//    }
}
