package exercicios;

import java.util.Scanner;



public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas?: ");
		int N = sc.nextInt();
		int sequencia = 1;
		String nome[] = new String [N];
		int idade[] = new int [N];
		double altura[] = new double [N];		
		for (int i=0; i<N; i++) {
			System.out.println("Dados da " + sequencia + "a pessoa:");
			sequencia+=1;
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		double sum = 0.0;
		double menosde16 = 0.0;
		for (int i=0; i<N; i++) {
			sum += altura[i];
			if (idade[i]<16) {
				menosde16+=1;
			}
		}
		System.out.printf("Altura Media: %.2f%n", sum/N);
		System.out.printf("Pessoas com menos de 16 anos: %.2f", (menosde16*100)/N);
		System.out.println("%");
		
		for (int i=0; i<N; i++) {
			if (idade[i]<16) {
				System.out.printf("%s\n", nome[i]);	
			}
		}
		sc.close();
	}
		
}
