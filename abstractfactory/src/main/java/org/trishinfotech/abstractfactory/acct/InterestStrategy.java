package org.trishinfotech.abstractfactory.acct;

public enum InterestStrategy {

	SIMPLE ("Simple Interest") {
		@Override
		public double getInterest(AccountType accountType, double amount, int term) {
			if (accountType != null) {
				return ((amount * term * accountType.getRate()) / 100);
			}
			return 0.0d;
		}
	},
	COMPOUND ("Compound Interest") {
		@Override
		public double getInterest(AccountType accountType, double amount, int term) {
			if (accountType != null) {
				return amount * Math.pow(1.0 + accountType.getRate() / 100.0, term) - amount;
			}
			return 0.0d;
		}
	};
	
	private String name;
	
	InterestStrategy(String name) {
		this.name = name;
	}
	
	public abstract double getInterest(AccountType accountType, double amount, int term);

	public String getName() {
		return name;
	}
	
}
