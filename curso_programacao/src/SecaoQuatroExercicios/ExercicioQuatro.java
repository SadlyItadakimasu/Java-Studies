package SecaoQuatroExercicios;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de funcionario: ");
		int num = sc.nextInt();
		System.out.print("Numero de horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.print("Valor que recebe por hora: ");
		double valorhora = sc.nextDouble();
		double salario = horas*valorhora;
		System.out.println("Numero de funcionario: " + num);
		System.out.printf("Salario: R$%.2f", salario);
		sc.close();

	}

}
