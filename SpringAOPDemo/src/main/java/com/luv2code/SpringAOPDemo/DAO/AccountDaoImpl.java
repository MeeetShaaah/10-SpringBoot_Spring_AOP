package com.luv2code.SpringAOPDemo.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Override
    public void addAccount() {
        System.out.println("Adding an account in the database");
    }
}
