package org.trishinfotech.abstractfactory;

import org.trishinfotech.abstractfactory.acct.Account;
import org.trishinfotech.abstractfactory.acct.AccountOpeningDetails;

public abstract class AbstractAccountFactory {
	
	public abstract Account createAccount(AccountOpeningDetails opendingDetails);
	
}
