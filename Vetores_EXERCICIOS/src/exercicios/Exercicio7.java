package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vc vai digitar?: ");
		int n = sc.nextInt();
		double vect[] = new double [n];
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double avg = 0.0;
		for (int i=0; i<vect.length; i++) {
			avg+=vect[i];
		}
		System.out.printf("MEDIA DO VETOR: %.3f%n", avg/n);
		System.out.println("NUMEROS ABAIXO DA MEDIA:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i]<avg/n) {
				System.out.println(vect[i]);
			}
		}
		sc.close();

	}

}
