package secaoSeisExercicios;

import java.util.Scanner;

public class exercicioseila {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=0; i<N; i++) {
			Double x1 = sc.nextDouble();
			Double x2 = sc.nextDouble();
			Double x3 = sc.nextDouble();
			Double resultado = (x1*2 + x2*3 + x3*5)/10;
			System.out.printf("%.1f%n", resultado);
		}
		sc.close();
	}

}
