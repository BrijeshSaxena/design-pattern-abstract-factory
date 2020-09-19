package org.trishinfotech.abstractfactory.acct;

public abstract class Account {

	protected long accountNo;
	protected String accountHolderName;
	protected AccountType accountType;
	protected InterestStrategy interestStrategy;
	protected double amount;

	public Account() {
		super();
	}

	public Account(long accountNo, String accountHolderName, AccountType accountType) {
		this();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public InterestStrategy getInterestStrategy() {
		return interestStrategy;
	}

	public void setInterestStrategy(InterestStrategy interestStrategy) {
		this.interestStrategy = interestStrategy;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void deposit(double amount) {
		// check for only positive/valid amount
		if (amount > 0.0d) {
			this.amount += amount;
		}
	}

	public void withdraw(double amount) {
		// check for only positive/valid amount and also for below than the available
		// amount in account
		if (amount > 0.0d && amount < this.amount) {
			this.amount -= amount;
		}
	}

	public abstract double getInterest(int term);

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accountNo=").append(getAccountNo()).append(", accountHolderName=")
				.append(getAccountHolderName()).append(", accountType=").append(getAccountType()).append(", rate=")
				.append((getAccountType() != null) ? getAccountType().getRate() : 0.0d).append(", interestStrategy=")
				.append(getInterestStrategy().getName()).append(", amount=").append(getAmount()).append("]");
		return builder.toString();
	}

}
