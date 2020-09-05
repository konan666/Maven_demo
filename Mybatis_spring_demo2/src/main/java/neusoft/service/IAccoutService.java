package neusoft.service;

import neusoft.domain.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 11:38
 */
public interface IAccoutService {
    List<Account> findAll() throws SQLException;
    Account findAllById(Integer id) throws SQLException;
    void save(Account account) throws SQLException;
    void update(Account account) throws SQLException;
    void delete(Integer id) throws SQLException;
}
