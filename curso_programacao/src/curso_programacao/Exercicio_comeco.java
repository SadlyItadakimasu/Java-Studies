package curso_programacao;

import java.util.Scanner;

public class Exercicio_comeco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAMA LEITURA DE MEDIDAS");
		System.out.printf("%nDIGITE O COMPRIMENTO EM METROS DO SEU TERRENO: ");
		Double COMPRIMENTO = sc.nextDouble();
		System.out.print("DIGITE A LARGURA EM METROS DO SEU TERRENO: ");
		Double LARGURA = sc.nextDouble();
		System.out.printf("COMPRIMENTO = %.1fm%nLARGURA = %.1fm%n", COMPRIMENTO, LARGURA);
		System.out.print("DIGITE O VALOR DO METRO QUADRADO DO SEU TERRENO: ");
		Double VALORMETRO2 = sc.nextDouble();
		Double AREA = COMPRIMENTO*LARGURA;
		Double VALORTERRENO = AREA*VALORMETRO2;
		System.out.printf("%nAREA = %.2fm²%nVALOR DO TERRENO = R$%.2f%n", AREA, VALORTERRENO);
		System.out.println("OBRIGADO POR USAR MEU PROGRAMA E NOIS");
		
		sc.close();

	}

}
