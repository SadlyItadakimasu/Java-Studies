package exercicios;

import java.util.Scanner;

public class ExercicioMaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("QUANTAS PESSOAS VC VAI DIGITAR?: ");
		int n = sc.nextInt();
		String nome[] = new String[n];
		int idade[] = new int [n];
		for (int i=0; i<n; i++) {
			System.out.printf("DADOS DA %da PESSOA: %n", i + 1);
			System.out.print("Nome: ");
			nome [i] = sc.nextLine();
			sc.nextLine();
			System.out.print("IDADE: ");
			idade[i]=sc.nextInt();
		}
		int maiorIdade = 0;
		for (int i=0; i<n; i++) {
			if (idade[i]>maiorIdade) {
				maiorIdade = idade[i];
			}
		}
		
		for (int i=0; i<n; i++) {
			if (idade[i]>=maiorIdade) {
				System.out.print("MAIOR IDADE:" + nome[i]);
			}
		}
		sc.close();
	}

}
