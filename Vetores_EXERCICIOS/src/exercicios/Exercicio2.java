package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vc vai digitar?: ");
		int N = sc.nextInt();
		double vect[] = new double [N];
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		double avg = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum+=vect[i];
			avg+=vect[i];
		}
		System.out.print("VALORES: ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		System.out.printf("%nSOMA: %.2f%n", sum);
		System.out.printf("MEDIA: %.2f%n", avg/N);
		sc.close();
	}

}
