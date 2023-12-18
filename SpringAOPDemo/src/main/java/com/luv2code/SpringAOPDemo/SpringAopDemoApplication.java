package com.luv2code.SpringAOPDemo;

import java.util.List;

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
			// demoTheBeforeAdvice(theAccountDao, theMembershipDao);
			demoOfAfterreturningAop(theAccountDao);
		};
	}

	private void demoOfAfterreturningAop(AccountDao theAccountDao) {
		List<Account> theAccounts = theAccountDao.findAccounts();

		System.out.println("Running Main Program");

		System.out.println(theAccounts);

		System.out.println("\n");
	}

	private void demoTheBeforeAdvice(AccountDao theAccountDao, MembershipDao theMembershipDao) {

		Account myAccount = new Account();
		theAccountDao.addAccount(myAccount);
		theMembershipDao.addAccount();
	}
}
