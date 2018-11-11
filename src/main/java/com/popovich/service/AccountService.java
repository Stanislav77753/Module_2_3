package com.popovich.service;

import com.popovich.dao.AccountDaoImp;
import com.popovich.model.Account;

import java.util.List;

public class AccountService {
    private AccountDaoImp accountDaoImp = new AccountDaoImp();

    public void save(Account account){
        accountDaoImp.save(account);
    }

    public List<Account> getAll(){
        return accountDaoImp.getAll();
    }

    public void delete(Account account){
        accountDaoImp.delete(account);
    }
}
