package com.neusoft.dao;

import com.neusoft.domain.Account;
import com.neusoft.domain.AccountUser;

import java.util.List;

/**
 * @author ：konan
 * @date ：2020/9/6 11:38
 */
public interface AccountDao {
    List<Account> findAll();
    List<AccountUser> findUser();
    Account findById(Integer id);
}
