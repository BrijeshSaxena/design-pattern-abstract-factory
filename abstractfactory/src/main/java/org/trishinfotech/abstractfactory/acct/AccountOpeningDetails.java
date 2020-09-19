package org.trishinfotech.abstractfactory.acct;

public class AccountOpeningDetails {
	private long accountNo;
	private String accountHolderName;
	private AccountType accountType;
	private int termInMonths;

	
	public AccountOpeningDetails(long accountNo, String accountHolderName, AccountType accountType) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}

	public AccountOpeningDetails(long accountNo, String accountHolderName, AccountType accountType, int termInMonths) {
		this(accountNo, accountHolderName, accountType);
		this.termInMonths = termInMonths;
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

	public int getTermInMonths() {
		return termInMonths;
	}

	public void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}

	public boolean isNotValid(boolean requiredTermInMonths) {
		return (accountNo <= 0l || accountHolderName == null || accountHolderName.trim().isEmpty()
				|| accountType == null || (requiredTermInMonths ? termInMonths > 0 : false));
	}

}
