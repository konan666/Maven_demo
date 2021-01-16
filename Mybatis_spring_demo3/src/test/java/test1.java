import neusoft.domain.Emp;
import neusoft.service.EmpService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 16:10
 */
public class test1 {
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
    EmpService as= ac.getBean("empServiceImpl", EmpService.class);
    @Test
    public void findall() throws SQLException {
        List<Emp> list=as.findAll();
        for(Emp e:list){
            System.out.println(e);
        }
    }
    @Test
    public void findallbyid() throws SQLException {
        Emp emp=as.findAllById(7369);
        System.out.println(emp);
    }
    @Test
    public void save() throws SQLException {
        Emp emp = new Emp();
        emp.setEname("666");
        as.save(emp);

    }
    @Test
    public void update() throws SQLException {
        Emp emp = new Emp();
        emp.setEname("666");
        emp.setEmpno(7934);
        as.update(emp);
    }
    @Test
    public  void delete() throws SQLException {
        as.delete(1562);
    }
}
