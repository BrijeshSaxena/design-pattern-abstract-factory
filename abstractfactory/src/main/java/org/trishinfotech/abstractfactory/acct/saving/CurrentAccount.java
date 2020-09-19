package org.trishinfotech.abstractfactory.acct.saving;

import org.trishinfotech.abstractfactory.acct.Account;
import org.trishinfotech.abstractfactory.acct.AccountType;
import org.trishinfotech.abstractfactory.acct.InterestStrategy;

public class CurrentAccount extends Account {

	public CurrentAccount(long accountNo, String accountHolderName) {
		super(accountNo, accountHolderName, AccountType.CURRENT);
		setInterestStrategy(InterestStrategy.SIMPLE);
	}

	@Override
	public double getInterest(int term) {
		return this.getInterestStrategy().getInterest(accountType, amount, term);
	}

}
