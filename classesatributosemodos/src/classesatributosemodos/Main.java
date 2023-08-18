package classesatributosemodos;

import java.util.Scanner;

import entities.retangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		retangulo retangulo;
		retangulo = new retangulo();
		System.out.println("ENTER RECTANGLE WIDTH AND HEIGHT: ");
		retangulo.width=sc.nextDouble();
		retangulo.height=sc.nextDouble();
		System.out.println("AREA = " + retangulo.area());
		System.out.println("PERIMETER = " + retangulo.perimeter());
		System.out.println("DIAGONAL = " + retangulo.diagonal());
		sc.close();
	}
}