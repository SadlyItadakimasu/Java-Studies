package secaoSeisExercicios;

import java.util.Scanner;

public class exercicioooo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=0; i<N; i++) {
			double numerador = sc.nextDouble();
			double denominador = sc.nextDouble();
			double divisao = numerador/denominador;
			if (denominador == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				System.out.printf("%.1f%n", divisao);
			}
		}
		sc.close();
	}

}
