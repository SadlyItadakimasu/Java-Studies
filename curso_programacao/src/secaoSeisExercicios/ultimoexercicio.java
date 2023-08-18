package secaoSeisExercicios;

import java.util.Scanner;

public class ultimoexercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			
			System.out.println(i+" "+i*i+" "+i*i*i);
		}
		
		sc.close();
		
	}
	public static int quadrado(int i) { 
		return (i*i);
	}
	public static int cubo(int i) {
		return (i*i*i);
	}
	public static void showresult(int resultado) {
		System.out.println(resultado);
	}

}
