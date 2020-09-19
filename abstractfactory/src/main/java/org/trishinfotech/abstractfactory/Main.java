package org.trishinfotech.abstractfactory;

import org.trishinfotech.abstractfactory.acct.Account;
import org.trishinfotech.abstractfactory.acct.AccountOpeningDetails;
import org.trishinfotech.abstractfactory.acct.AccountType;

public class Main {

	public static void main(String[] args) {

		AbstractAccountFactory factory = AccountFactoryProvider.getAccountFactory("SAVING");
		Account acct1 = factory.createAccount(new AccountOpeningDetails(12345678l, "Vijay Kumar", AccountType.SAVING));
		acct1.deposit(10000.0d);

		System.out.print(acct1);
		System.out.printf(" has interest : %10.2f\n", acct1.getInterest(5));

		Account acct2 = factory.createAccount(new AccountOpeningDetails(12345680l, "Jay Kumar", AccountType.CURRENT));
		acct2.deposit(10000.0d);

		System.out.print(acct2);
		System.out.printf(" has interest : %10.2f\n", acct2.getInterest(5));
		
		factory = AccountFactoryProvider.getAccountFactory("DEPOSIT");
		Account acct3 = factory.createAccount(new AccountOpeningDetails(12345681l, "Micheal", AccountType.FIXED_DEPOSIT));
		acct3.deposit(10000.0d);

		System.out.print(acct3);
		System.out.printf(" has interest : %10.2f\n", acct3.getInterest(5));

		Account acct4 = factory.createAccount(new AccountOpeningDetails(12345682l, "Kim", AccountType.RECURRING_DEPOSIT));
		acct4.deposit(10000.0d);

		System.out.print(acct4);
		System.out.printf(" has interest : %10.2f\n", acct4.getInterest(5));
		
		factory = AccountFactoryProvider.getAccountFactory("LOAN");
		Account acct5 = factory.createAccount(new AccountOpeningDetails(12345683l, "Racheal", AccountType.HOME_LOAN));
		acct5.withdraw(10000.0d);

		System.out.print(acct5);
		System.out.printf(" has interest : %10.2f\n", acct5.getInterest(5));

		Account acct6 = factory.createAccount(new AccountOpeningDetails(12345685l, "Martin", AccountType.VEHICLE_LOAN));
		acct6.withdraw(10000.0d);

		System.out.print(acct6);
		System.out.printf(" has interest : %10.2f\n", acct6.getInterest(5));
		
		Account acct7 = factory.createAccount(new AccountOpeningDetails(12345686l, "Mike", AccountType.PERSONAL_LOAN));
		acct7.withdraw(10000.0d);

		System.out.print(acct7);
		System.out.printf(" has interest : %10.2f\n", acct7.getInterest(5));
	}

}
