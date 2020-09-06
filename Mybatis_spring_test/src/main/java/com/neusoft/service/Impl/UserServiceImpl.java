package com.neusoft.service.Impl;

import com.neusoft.dao.UserDao;
import com.neusoft.domain.User;
import com.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/6 8:34
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;


    @Override
    public List<User> findAll() throws SQLException {
        return dao.findAll();
    }

    @Override
    public User findAllById(Integer id) throws SQLException {
        return dao.findAllById(id);
    }

    @Override
    public void save(User user) throws SQLException {

        dao.save(user);
    }

    @Override
    public void update(User user) throws SQLException {

        dao.update(user);
    }

    @Override
    public void delete(Integer id) throws SQLException {

        dao.delete(id);
    }
}
