package com.luv2code.SpringAOPDemo.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.luv2code.SpringAOPDemo.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Override
    public void addAccount(Account theAccount) {
        System.out.println("Adding an account in the database");
    }

    @Override
    public List<Account> findAccounts() {
       List<Account> myAccounts = new ArrayList<>();

       Account tempAccount1 = new Account("Meet", "Silver");
       Account tempAccount2 = new Account("Prexu", "Gold");

       myAccounts.add(tempAccount1);
       myAccounts.add(tempAccount2);

       return myAccounts;
    }
}
