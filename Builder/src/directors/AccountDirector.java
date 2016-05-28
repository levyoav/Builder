package directors;

import products.Account;
import builders.AccountBuilder;

//Director - set with a concrete builder and uses its methods to build an account.
public class AccountDirector {

	private AccountBuilder builder;

	//Receives either a RegularAccountBuilder or GoldAccountBuilder object.
	public void setAccountBuilder(AccountBuilder builder) {
		this.builder = builder;
	}

	//Returns the account that was created.
	public Account getAccount() {
		return builder.getAccount();
	}

	//Creates an Account object of type either gold or regular, depending
	//on the  type of the builder. 
	public void constructAccount() {
		builder.createNewAccount();
		builder.setType();
		builder.setCommission();
	}
}
