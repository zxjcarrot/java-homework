package exe5.banking;

public class CheckingAccount extends Account {
	private double overdraftProtection;
	public CheckingAccount(double bal) {
		super(bal);
		overdraftProtection = 0;
	}
	
	public CheckingAccount(double bal, double protect) {
		super(bal);
		overdraftProtection = protect;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount <= this.balance) {
			this.balance -= amount;
		} else if (overdraftProtection >= 0 && amount <= overdraftProtection) {
				overdraftProtection -= amount;
				balance = 0;
		} else {
			return false;
		}
		
		return true;
	}
	
	

}
