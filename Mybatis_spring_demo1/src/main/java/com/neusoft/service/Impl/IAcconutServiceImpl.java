package com.neusoft.service.Impl;

import com.neusoft.dao.IAccountDao;
import com.neusoft.dao.Impl.IAccountDaoImpl;
import com.neusoft.domain.Account;
import com.neusoft.service.IAccoutService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 11:39
 */
public class IAcconutServiceImpl implements IAccoutService {
    private IAccountDao dao=new IAccountDaoImpl();

    @Override
    public List<Account> findAll() throws SQLException {
        return dao.findAll();
    }

    @Override
    public Account findAllById(Integer id) throws SQLException {
        return dao.findAllById(id);
    }

    @Override
    public void save(Account account) throws SQLException {
   dao.save(account);
    }

    @Override
    public void update(Account account) throws SQLException {

        dao.update(account);
    }

    @Override
    public void delete(Integer id) throws SQLException {

        dao.delete(id);
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.dao=accountDao;
    }
}
