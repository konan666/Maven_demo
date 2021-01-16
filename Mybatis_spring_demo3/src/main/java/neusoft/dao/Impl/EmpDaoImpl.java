package neusoft.dao.Impl;

import neusoft.dao.EmpDao;
import neusoft.domain.Emp;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 16:02
 */
@Repository()
public class EmpDaoImpl implements EmpDao {
    @Autowired
    private QueryRunner queryRunner;
    @Override
    public List<Emp> findAll() throws SQLException {

        return queryRunner.query("select * from emp",new BeanListHandler<Emp>(Emp.class));
    }

    @Override
    public Emp findAllById(Integer id) throws SQLException {
        return queryRunner.query("select * from emp where empno=?",new BeanHandler<Emp>(Emp.class),id);
    }

    @Override
    public void save(Emp emp) throws SQLException {
    queryRunner.update("insert into emp(ename) values(?)",emp.getEname());
    }

    @Override
    public void update(Emp emp) throws SQLException {
   queryRunner.update("update emp set ename=? where empno=?",emp.getEname(),emp.getEmpno());
    }

    @Override
    public void delete(Integer id) throws SQLException {
  queryRunner.update("delete from emp where empno=?",id);
    }
}
