package curso_programacao;

import java.util.Scanner;

public class TesteEntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String NOME;
		int IDADE;
		String PROFISSAO;
		int DIGITO1;
		int DIGITO2;
		int RESULTADO;
		
		System.out.println("Bem Vindo ao programa de calculo de media!");
		System.out.println("CADASTRO");
		System.out.print("Nome: ");
		NOME = sc.next();
        System.out.print("Idade: ");
		IDADE = sc.nextInt();
		System.out.print("Profissao: ");
		PROFISSAO = sc.next();
		System.out.println("OK! Bem Vindo " + NOME + ("!"));
		System.out.println("INICIANDO CALCULO DE MEDIAS");
		System.out.print("Insira o primeiro valor: ");
		DIGITO1 = sc.nextInt();
	    System.out.print("Insira o segundo valor: ");
	    DIGITO2 = sc.nextInt();
	    System.out.println("CALCULO REALIZADO");
	    RESULTADO = (DIGITO1+DIGITO2)/2;
	    System.out.println("O RESULTADO EH: " + RESULTADO);		
		System.out.println(" OBRIGADO POR UTILIZAR NOSSO PROGRAMA!");
		sc.close();
	}

}
