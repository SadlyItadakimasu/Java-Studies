package TestesProgramacao;

import java.util.Scanner;

public class TesteBomDia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte hora;
		System.out.print("Qual seu nome?: ");
		String nome = sc.next();
		System.out.print("Que horas sao?: ");
		hora = sc.nextByte();
		if (hora<12) {
			System.out.println("Bom Dia " + nome + "!");
		}
		else {
			if (hora<18) {
				System.out.println("Boa Tarde " + nome + "!");
			}
			else {
				if (hora>23) {
				System.out.println("wtf mano essa hora nem existe");
			}
				else {
					System.out.println("Boa Noite " + nome + "!");
				}
		}
		sc.close();

	}

	}
}
