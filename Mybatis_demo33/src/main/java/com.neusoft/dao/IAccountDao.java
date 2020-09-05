package com.neusoft.dao;

import com.neusoft.domain.Account;
import com.neusoft.domain.AccountUser;
import com.neusoft.domain.User;

import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/5 8:55
 */
public interface IAccountDao {
    List<Account> findAll();
    List<AccountUser> findAllUser();

}
