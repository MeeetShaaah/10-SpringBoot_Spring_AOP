package com.luv2code.SpringAOPDemo.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDaoImpl implements MembershipDao{

    @Override
    public void addAccount() {
        System.out.println("Adding Membership account to DB");
    }

}
