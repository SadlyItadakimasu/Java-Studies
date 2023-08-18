package SecaoCincoExercicios;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A % B == 0) {
			System.out.println("Sao multiplos!");
		}
		else if (B % A == 0) {
			System.out.println("Sao multiplos!");
		}
		else {
			System.out.println("Nao sao multiplos!");
		}
		sc.close();
	}

}
