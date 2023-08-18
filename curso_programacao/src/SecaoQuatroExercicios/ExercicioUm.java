package SecaoQuatroExercicios;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("SOMA DE NUMEROS INTEIROS%n%nPRIMEIRO NUMERO: ");
		int num1 = sc.nextInt();
		System.out.print("SEGUNDO NUMERO: ");
		int num2 = sc.nextInt();
		int soma = num1+num2;
		System.out.println("RESULTADO DA SOMA: " + soma);
		
		sc.close();

	}

}
