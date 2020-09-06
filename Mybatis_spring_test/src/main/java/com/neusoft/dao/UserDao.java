package com.neusoft.dao;

import com.neusoft.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/6 8:03
 */
public interface UserDao {
    List<User> findAll() throws SQLException;
    User findAllById(Integer id) throws SQLException;
    void save(User user) throws SQLException;
    void update(User user) throws SQLException;
    void delete(Integer id) throws SQLException;
}
