package exe8;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0.0d;
	private double annualRate = 0.0d;
	private Date dateCreated;
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int id, double bal, double annualRate) {
		this.id = id;
		this.balance = bal;
		this.annualRate = annualRate;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualRate() {
		return annualRate;
	}

	public void setAnnualRate(double annualRate) {
		this.annualRate = annualRate;
	}
	
	public double getMonthlyRate() {
		return annualRate / 12;
	}
	public void withDraw(double amt) {
		if (amt > balance)
			balance -= amt;
	}
	public void deposit(double amt) {
		this.balance += amt;
	}
	public void show() {
		System.out.println("余额:" + balance + ", 月利率:" + getMonthlyRate() + ", 开户日期:" + dateCreated);
	}
}
