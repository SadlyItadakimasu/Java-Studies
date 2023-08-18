package testinho;

import java.util.Scanner;

import entities.triangle;

public class testeeehahahah {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		triangle x, y;
		x = new triangle();
		y = new triangle();
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areax = x.area();
		double areay = y.area();
		double larger = larger(areax, areay);
		System.out.printf("area x = %.4f%n", areax);
		System.out.printf("area y = %.4f%n", areay);
		System.out.printf("Larger: %.4f", larger);
		sc.close();
	}
	public static double larger(double a, double b) {
		if (a>b) {
			return a;
		}
		else {
			return b;
		}
	}
}
