package Ano;

import java.util.Scanner;

import entities.aluno;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		aluno al = new aluno();
		al.name=sc.nextLine();
		al.grade1=sc.nextDouble();
		al.grade2=sc.nextDouble();
		al.grade3=sc.nextDouble();
		System.out.println("FINAL GRADE = " + al.FinalGrade());
		if (al.FinalGrade()>60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60-al.FinalGrade());
		}
		sc.close();
	}

}
