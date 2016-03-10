package exe3.banking;

public class Account {
	private double balance;
	public Account(double init_balance) {
		balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	public void withdraw(double amt) {
		if (balance >= amt)
			balance -= amt;
	}
	
}
