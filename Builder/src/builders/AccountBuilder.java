package builders;

import products.Account;

//Account Builder
/*
 * This defines the interface of objects that builder creates.
 */
public abstract class AccountBuilder {
	//The AccountBuilder holds the account that is built as an attribute to be
	//returned upon request.
	protected Account account;

	public Account getAccount() {
		return account;
	}

	public void createNewAccount() {
		account = new Account();
	}

	public abstract void setType();
	public abstract void setCommission();

}
