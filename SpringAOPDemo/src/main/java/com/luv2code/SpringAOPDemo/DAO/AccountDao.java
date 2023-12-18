package com.luv2code.SpringAOPDemo.DAO;

import java.util.List;

import com.luv2code.SpringAOPDemo.Account;

public interface AccountDao {
    void addAccount(Account theAccount);
    List<Account> findAccounts();
}
