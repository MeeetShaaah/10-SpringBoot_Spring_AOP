package com.luv2code.SpringAOPDemo.DAO;

import org.springframework.stereotype.Repository;

import com.luv2code.SpringAOPDemo.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Override
    public void addAccount(Account theAccount) {
        System.out.println("Adding an account in the database");
    }
}
