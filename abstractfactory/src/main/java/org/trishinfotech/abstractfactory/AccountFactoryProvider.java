package org.trishinfotech.abstractfactory;

import org.trishinfotech.abstractfactory.acct.deposit.DepositAccountFactory;
import org.trishinfotech.abstractfactory.acct.loan.LoanAccountFactory;
import org.trishinfotech.abstractfactory.acct.saving.AccountFactory;

public class AccountFactoryProvider {

	public static AbstractAccountFactory getAccountFactory(String accountCategory) {
		AbstractAccountFactory accountFactory = null;
		if (accountCategory != null) {
			switch (accountCategory) {
			case "SAVING":
				accountFactory = new AccountFactory();
				break;
			case "LOAN":
				accountFactory = new LoanAccountFactory();
				break;
			case "DEPOSIT":
				accountFactory = new DepositAccountFactory();
				break;
			default:
				break;
			}
		}
		return accountFactory;
	}
}
