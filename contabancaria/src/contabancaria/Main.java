package contabancaria;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Account conta;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char choice = sc.next().charAt(0);
		if (choice == 'y') {
			System.out.println();
			System.out.print("Enter deposit value: ");
			double deposito1 = sc.nextDouble();
			conta = new Account(number, name, deposito1);
		}
		else {
			conta = new Account(name, number);
		}
		
		
		System.out.println();
		System.out.println(conta);
		
		System.out.print("Enter a deposit value: ");
		double value1 = sc.nextDouble();
		conta.deposit(value1);
		System.out.println();
		System.out.println("Updated Data: ");
		System.out.println(conta);
		
		
		System.out.print("Enter a withdraw value: ");
		double withdrawvalue = sc.nextDouble();
		conta.withdraw(withdrawvalue);
		System.out.println();
		System.out.println("Updated Data: ");
		System.out.println(conta);
			
		sc.close();
	}
}
