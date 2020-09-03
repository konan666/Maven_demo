package com.neusoft.dao;

import com.neusoft.domain.User;

import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/3 14:34
 */
public interface IUserDao {
    // 查询所有
    List<User> findAll();
}
