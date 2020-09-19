package org.trishinfotech.abstractfactory.acct;

public enum AccountType {

	SAVING(2.0d), CURRENT(1.0d), HOME_LOAN(3.0d), VEHICLE_LOAN(4.0d), PERSONAL_LOAN(5.0d), RECURRING_DEPOSIT(2.5d), FIXED_DEPOSIT(3.5d);

	private double rate;

	AccountType(final double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

}
