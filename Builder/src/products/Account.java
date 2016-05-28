package products;

import java.util.Calendar;

//Product
/*
 * Holds a complex account data.
 */
public class Account {
	private long id;
	private AccountType type;
	private Calendar start,end;
	private double balance,commision;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public Calendar getStart() {
		return start;
	}

	public void setStart(Calendar start) {
		this.start = start;
	}

	public Calendar getEnd() {
		return end;
	}

	public void setEnd(Calendar end) {
		this.end = end;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", type=" + type + ", start=" + start
				+ ", end=" + end + ", balance=" + balance + ", commision="
				+ commision + "]";
	}

	//Many complex operations:
	public void withdraw(double amount) {
		System.out.println("Account.withdraw() " + amount);
	}

	public void deposit(double amount) {
		System.out.println("Account.deposit()" + amount);
	}

	public void closeAccount() {
		System.out.println("Account.closeAccount()");
	}

}
