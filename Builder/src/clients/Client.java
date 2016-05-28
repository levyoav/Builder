package clients;

import products.Account;
import builders.GoldAccountBuilder;
import directors.AccountDirector;

public class Client {
	public static void main(String[] args) {
		//Create a director to determine which builder to use. 
		AccountDirector director = new AccountDirector();
		GoldAccountBuilder gb = new GoldAccountBuilder();
		
		//Setting the builder in the director to be a GoldAccountBuilder.
		director.setAccountBuilder(gb);
		//Creating a gold account using the GoldAccountBuilder in the director.
		director.constructAccount();
		
		/*
		 * Getting the created account form the builder in the director.
		 */
		Account account = director.getAccount();
		
		System.out.println(account);
	}
}
