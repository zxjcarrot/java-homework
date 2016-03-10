package exe5.banking;

public class SavingsAccount extends Account {
	private double interestRate;
	public SavingsAccount(double bal, double interest_rate) {
		super(bal);
		this.interestRate = interest_rate;
	}

}
