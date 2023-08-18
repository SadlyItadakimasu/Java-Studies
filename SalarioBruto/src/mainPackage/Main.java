package mainPackage;

import java.util.Scanner;

import entities.employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		employee employee;
		employee=new employee();
		System.out.print("Name: ");
		employee.name=sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.GrossSalary=sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax=sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + employee.ToString());
		System.out.println("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		System.out.println("Updated Data: " + employee.name+", $ " + employee.NetSalary());
		sc.close();
	}

}
