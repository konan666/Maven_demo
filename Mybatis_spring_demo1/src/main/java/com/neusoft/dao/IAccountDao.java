package com.neusoft.dao;

import com.neusoft.domain.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 11:06
 */
public interface IAccountDao {
    List<Account> findAll() throws SQLException;
    Account findAllById(Integer id) throws SQLException;
    void save(Account account) throws SQLException;
    void update(Account account) throws SQLException;
    void delete(Integer id) throws SQLException;

}
