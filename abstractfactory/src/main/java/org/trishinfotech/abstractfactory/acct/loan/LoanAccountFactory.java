package org.trishinfotech.abstractfactory.acct.loan;

import org.trishinfotech.abstractfactory.AbstractAccountFactory;
import org.trishinfotech.abstractfactory.acct.AccountOpeningDetails;
import org.trishinfotech.abstractfactory.acct.AccountType;

public class LoanAccountFactory extends AbstractAccountFactory {

	@Override
	public LoanAccount createAccount(AccountOpeningDetails openingDetails) {
		if (openingDetails == null || openingDetails.isNotValid(true)) {
			throw new IllegalArgumentException("Account Opening Details are not valid!");
		}
		LoanAccount account = null;
		AccountType type = openingDetails.getAccountType();
		switch (type) {
		case PERSONAL_LOAN:
			account = new PersonalLoanAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName(),
					openingDetails.getTermInMonths());
			break;
		case HOME_LOAN:
			account = new HomeLoanAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName(),
					openingDetails.getTermInMonths());
			break;
		case VEHICLE_LOAN:
			account = new VehicleLoanAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName(),
					openingDetails.getTermInMonths());
			break;
		default:
			System.err.println("Unknown/unsupported account-type.");
		}
		return account;
	}
}
