package SecaoQuatroExercicios;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("CALCULO DE AREA DE CIRCULO%n%nDIGITE O VALOR DO RAIO DO CIRCULO: ");
		double raio = sc.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2);
		System.out.printf("AREA = %.4f", area);
		
		sc.close();
	}

}
