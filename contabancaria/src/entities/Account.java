package entities;

public class Account {
	
	private String name;
	private int accountnumber;
	private double balance;
	
	
	public Account(int accountnumber, String name, double initialdeposit) {
		this.name = name;
		this.accountnumber = accountnumber;
		deposit(initialdeposit);
	}


	public Account(String name, int accountnumber) {
		this.name = name;
		this.accountnumber = accountnumber;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public int getaccountnumber() {
		return accountnumber;
	}
	
	
	public void deposit(double deposito) {
		balance += deposito;
	}
	public void withdraw(double saque) {
		balance -= saque+5;
	}
	
	public String toString() {
		return "Account "
				+ accountnumber
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f%n", balance);
				
				
	}
	
	
}
