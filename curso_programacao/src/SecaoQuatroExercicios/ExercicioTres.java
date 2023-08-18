package SecaoQuatroExercicios;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A = ");
        int A = sc.nextInt();
        System.out.print("B = ");
        int B = sc.nextInt();
        System.out.print("C = ");
        int C = sc.nextInt();
        System.out.print("D = ");
        int D = sc.nextInt();
        int resultado = (A*B)-(C*D);
        System.out.println("RESULTADO = " + resultado);
        sc.close();
	}

}
