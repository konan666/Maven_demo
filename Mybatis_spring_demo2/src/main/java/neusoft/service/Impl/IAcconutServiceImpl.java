package neusoft.service.Impl;


import neusoft.dao.IAccountDao;
import neusoft.dao.Impl.IAccountDaoImpl;
import neusoft.domain.Account;
import neusoft.service.IAccoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 11:39
 */
//@Component("acconutService")
    @Service
public class IAcconutServiceImpl implements IAccoutService {
    @Autowired
    private IAccountDao dao;

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


}
