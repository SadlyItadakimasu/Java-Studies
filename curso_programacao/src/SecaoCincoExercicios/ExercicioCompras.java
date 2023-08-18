package SecaoCincoExercicios;

import java.util.Scanner;

public class ExercicioCompras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Total = 0.00;
		System.out.print("Codigo do produto: ");
		int codigo = sc.nextInt();
		if (codigo > 5 || codigo < 1) {
			System.out.println("PRODUTO NAO EXISTENTE");
		} else {
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			switch (codigo) {
			case 1:
				Total = 4.00 * quantidade;
				break;
			case 2:
				Total = 4.50 * quantidade;
				break;
			case 3:
				Total = 5.00 * quantidade;
				break;
			case 4:
				Total = 2.00 * quantidade;
				break;
			default:
				Total = 1.50 * quantidade;
			}
			System.out.printf("TOTAL: R$ %.2f", Total);
		}

		sc.close();

	}

}
