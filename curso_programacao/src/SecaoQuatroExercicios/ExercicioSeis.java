package SecaoQuatroExercicios;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A = ");
		double A = sc.nextDouble();
		System.out.print("B = ");
		double B = sc.nextDouble();
		System.out.print("C = ");
		double C = sc.nextDouble();
		double areatriangulo = A*C/2;
		System.out.printf("%nArea do triângulo retângulo que tem A por base e C por altura: %.3f%n", areatriangulo);
		double areacirculo = 3.14159*Math.pow(C, 2);
		System.out.printf("Area do circulo de raio C: %.3f%n", areacirculo);
		double areatrapezio = (A+B)*C/2;
		System.out.printf("Area do trapezio de bases A e B e altura C: %.3f%n", areatrapezio);
		double areaquadrado = Math.pow(B, 2);
		System.out.printf("Area do quadrado de lado B: %.3f%n", areaquadrado);
		double arearetangulo = A*B;
		System.out.printf("Area do retangulo de lados A e B: %.3f%n", arearetangulo);
		sc.close();
				

	}

}
