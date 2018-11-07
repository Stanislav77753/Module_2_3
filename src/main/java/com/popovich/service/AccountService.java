package com.popovich.service;

import com.popovich.dao.AccountDaoImp;
import com.popovich.model.Account;

public class AccountService {
    private AccountDaoImp accountDaoImp = new AccountDaoImp();

    public void save(Account account){
        accountDaoImp.save(account);
    }
}
