package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vc vai digitar?: ");
		int n = sc.nextInt();
		int vect[] = new int [n];
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		int quantiapares = 0;
		System.out.println("NUMEROS PARES:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				quantiapares+=1;
				System.out.print(vect[i] + " ");
			}
		}
		System.out.printf("%nQUANTIA DE PARES: %d", quantiapares);
		sc.close();
	}

}
