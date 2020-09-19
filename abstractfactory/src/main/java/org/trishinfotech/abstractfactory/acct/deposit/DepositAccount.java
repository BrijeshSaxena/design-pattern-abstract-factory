package org.trishinfotech.abstractfactory.acct.deposit;

import org.trishinfotech.abstractfactory.acct.Account;
import org.trishinfotech.abstractfactory.acct.AccountType;

public abstract class DepositAccount extends Account {

	protected int termInMonths;
	private boolean withdrawDone;
	
	public DepositAccount(long accountNo, String accountHolderName, AccountType accountType, int termInMonths) {
		super(accountNo, accountHolderName, accountType);
		this.termInMonths = termInMonths;
	}

	public int getTermInMonths() {
		return termInMonths;
	}

	public void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}

	@Override
	public void withdraw(double amount) {
		// ignore the given amount since we can withdraw whole amount at the maturity
		if (!withdrawDone && this.amount > 0.0d) {
			this.amount = 0.0d;
			withdrawDone = true;
		} else {
			System.out.println("Sorry! We can withdraw whole amount only once from a Deposit Account!");
		}
	}
}
