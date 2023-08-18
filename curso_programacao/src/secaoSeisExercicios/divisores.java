package secaoSeisExercicios;

import java.util.Scanner;

public class divisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=N; i>0; i--) {
			if (N%i == 0) {
				System.out.println(i);				
			}
		}
		sc.close();
	}

}
