package com.neusoft.dao.Impl;

import com.neusoft.dao.UserDao;
import com.neusoft.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/6 8:30
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private QueryRunner queryRunner;

    @Override
    public List<User> findAll() throws SQLException {
        return queryRunner.query("select * from user",new BeanListHandler<User>(User.class));
    }

    @Override
    public User findAllById(Integer id) throws SQLException {
        return queryRunner.query("select * from user where id=?",new BeanHandler<User>(User.class),id);
    }

    @Override
    public void save(User user) throws SQLException {

        queryRunner.update("insert into user(username)values (?)",user.getUsername());
    }

    @Override
    public void update(User user) throws SQLException {

        queryRunner.update("update user set username=? where id = ?",user.getUsername(),user.getId());
    }

    @Override
    public void delete(Integer id) throws SQLException {

        queryRunner.update("delete from user where id=?",id);
    }
}
