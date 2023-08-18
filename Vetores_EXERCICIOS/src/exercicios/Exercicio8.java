package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vc vai digitar?: ");
		int n = sc.nextInt();
		int vect[] = new int [n];
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		int npares=0;
		double avg = 0.0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
			avg+=vect[i];
			npares++;
			}
		}
			if (npares != 0) {
				System.out.printf("MEDIA DOS PARES: %.1f", avg/npares);
			}
			else {
			System.out.println("NENHUM NUMERO PAR");	
			}
			sc.close();
	    }
	    
		}

	


