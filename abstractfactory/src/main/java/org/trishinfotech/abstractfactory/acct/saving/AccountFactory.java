package org.trishinfotech.abstractfactory.acct.saving;

import org.trishinfotech.abstractfactory.AbstractAccountFactory;
import org.trishinfotech.abstractfactory.acct.Account;
import org.trishinfotech.abstractfactory.acct.AccountOpeningDetails;
import org.trishinfotech.abstractfactory.acct.AccountType;

public class AccountFactory extends AbstractAccountFactory {

	@Override
	public Account createAccount(AccountOpeningDetails openingDetails) {
		if (openingDetails == null || openingDetails.isNotValid(false)) {
			throw new IllegalArgumentException("Account Opening Details are not valid!");
		}
		Account account = null;
		AccountType type = openingDetails.getAccountType();
		switch (type) {
		case SAVING:
			account = new SavingAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName());
			break;
		case CURRENT:
			account = new CurrentAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName());
			break;
		default:
			System.err.println("Unknown/unsupported account-type.");
		}
		return account;
	}
}
