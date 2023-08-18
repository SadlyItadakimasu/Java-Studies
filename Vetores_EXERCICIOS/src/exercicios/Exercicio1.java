package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vezes;
		do {
			System.out.print("Quantos numeros voce vai digitar?: ");
			vezes = sc.nextInt();
		 } while (vezes>10);
		int vect[] = new int[vezes];
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i]=sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i]<0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}
}
