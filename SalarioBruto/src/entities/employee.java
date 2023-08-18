package entities;

public class employee {
	public String name;
	public double GrossSalary;
	public double tax;
	public double NetSalary() {
		return GrossSalary-tax;
	}
	public void IncreaseSalary(double percentage) {
	this.GrossSalary+=(percentage/100)*GrossSalary;
	}
	public String ToString() {
		return name
		+ ", $ "
		+ NetSalary();
	}
}
