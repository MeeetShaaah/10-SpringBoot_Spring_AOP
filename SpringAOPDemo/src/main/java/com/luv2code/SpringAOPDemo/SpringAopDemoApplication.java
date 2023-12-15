package com.luv2code.SpringAOPDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.luv2code.SpringAOPDemo.DAO.AccountDao;
import com.luv2code.SpringAOPDemo.DAO.MembershipDao;

@SpringBootApplication
public class SpringAopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao theAccountDao, MembershipDao theMembershipDao) {
		return runner -> {
			demoTheBeforeAdvice(theAccountDao, theMembershipDao);
		};
	}

	private void demoTheBeforeAdvice(AccountDao theAccountDao, MembershipDao theMembershipDao) {

		Account myAccount = new Account();
		theAccountDao.addAccount(myAccount);
		theMembershipDao.addAccount();
	}
}
