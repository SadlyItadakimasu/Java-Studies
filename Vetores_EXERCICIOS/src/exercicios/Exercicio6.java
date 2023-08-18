package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vc vai digitar?: ");
		int n = sc.nextInt();
		int A[] = new int [n];
		int B[] = new int [n];
		int C[] = new int [n];
		System.out.println("DIGITE OS VALORES DO VETOR A: ");
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println("DIGITE OS VALORES DO VETOR B: ");
		for (int i=0; i<B.length; i++) {
			B[i] = sc.nextInt();
		}
		System.out.println("VETOR RESULTANTE: ");
		for (int i=0; i<C.length; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}
		sc.close();
	}

}
