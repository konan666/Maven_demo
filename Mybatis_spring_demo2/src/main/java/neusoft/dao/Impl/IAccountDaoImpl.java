package neusoft.dao.Impl;


import neusoft.dao.IAccountDao;
import neusoft.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 11:09
 */
@Repository("acconutDao")
public class IAccountDaoImpl implements IAccountDao {
    @Autowired
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }


    @Override
    public List<Account> findAll() throws SQLException {
        return queryRunner.query("select * from account1",new BeanListHandler<Account>(Account.class));
    }

    @Override
    public Account findAllById(Integer id) throws SQLException {
        return queryRunner.query("select * from account1 where id=?",new BeanHandler<Account>(Account.class),id);
    }

    @Override
    public void save(Account account) throws SQLException {
     queryRunner.update("insert into account1(name,money)values(?,?)",account.getName(),account.getMoney());
    }

    @Override
    public void update(Account account) throws SQLException {
     queryRunner.update("update account1 set name=?,money=? where id=? ",account.getName(),account.getMoney(),account.getId());
    }

    @Override
    public void delete(Integer id) throws SQLException {
  queryRunner.update("delete from account1 where id=?",id);
    }
}
