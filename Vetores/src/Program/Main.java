package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double[] alturas = new double[x];
		
		for (int i=0; i<x; i++) {
			alturas[i]=sc.nextDouble();
		}
		
		double media = (alturas[0]+alturas[1]+alturas[2])/x;
		System.out.printf("AVERAGE HEIGHT: %.2f", media);
		sc.close();

		List<String> lista1 = new ArrayList<>();
		lista1.add(new String());
		String guilherme = "guilhermeemmememem";
		lista1.add(guilherme);
		guilherme.contains("a");
		lista1.get(0);
		
		
		String joana = lista1.get(0);
		System.out.println(joana.toString());
		
		
		
		
		
	}
}
