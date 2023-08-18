package programacontrato;

import java.util.Scanner;

public class ContratoCaucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     String NOMEPROP, RGP, CPFP, EMAILP, DATANASCP, ESTADOCIVILP, PROFISSAOP, ENDERECO, DATAENTRADA, DATASAIDA, VALOREXTENSO;
	     String CEP, CIDADE, DATAVENCEXT, NOMECLIENTE, RGC, CPFC, EMAILC, DATANASCC, ESTADOCIVILC, PROFISSAOC, NACIONALIDADEC;
	     String PRAZODESOC, DATAVENC;
	     double VALORALUGUEL;
	     
	     System.out.println("APOS DIGITAR CADA INFORMACAO, APERTE ENTER PARA CONTINUAR, E CERTIFIQUE DE DIGITAR TUDO CORRETAMENTE (PONTO, VIRGULA, BARRA, MAIUSCULA, ETC.");
	     System.out.println("");
	     System.out.print("NOME DO PROPRIETARIO (EM LETRAS MAIUSCULAS): ");
	     NOMEPROP = sc.nextLine();
	     	    	     
	     System.out.print("CPF: ");
	     CPFP = sc.nextLine();
	     
	     System.out.print("RG: ");
	     RGP = sc.nextLine();
	     
	     System.out.print("ESTADO CIVIL (em minusculo): ");
	     ESTADOCIVILP = sc.nextLine();
	     
	     System.out.print("PROFISSAO (em minusculo): ");
	     PROFISSAOP = sc.nextLine();
	     
	     System.out.print("DATA DE NASCIMENTO: ");
	     DATANASCP = sc.nextLine();
	     
	     System.out.print("E-MAIL: ");
	     EMAILP = sc.nextLine();
	     System.out.println("");
	     	     
	     System.out.print("NOME DO LOCATARIO (EM LETRAS MAIUSCULAS): ");
	     NOMECLIENTE = sc.nextLine();
	     	   
	     System.out.print("CPF: ");
	     CPFC = sc.nextLine();
	     
	     System.out.print("RG: ");
	     RGC = sc.nextLine();
	     
	     System.out.print("NACIONALIDADE (em minusculo): ");
	     NACIONALIDADEC = sc.nextLine();
	     
	     System.out.print("ESTADO CIVIL (em minusculo): ");
	     ESTADOCIVILC = sc.nextLine();
	     
	     System.out.print("PROFISSAO (em minusculo): ");
	     PROFISSAOC = sc.nextLine();
	     
	     System.out.print("DATA DE NASCIMENTO: ");
	     DATANASCC = sc.nextLine();
	     
	     System.out.print("E-MAIL: ");
	     EMAILC = sc.nextLine();
	     System.out.println("");
	     	     
	     System.out.print("ENDERECO (exemplo = Rua ****, 123, bairro *****) : ");
	     ENDERECO = sc.nextLine();
	     
	     System.out.print("CEP (exemplo = 08770-450) : ");
	     CEP = sc.nextLine();
	     
	     System.out.print("CIDADE: ");
	     CIDADE = sc.nextLine();
	     
	     System.out.print("DATA DE INICIO DE VIGENCIA DO CONTRATO: ");
	     DATAENTRADA = sc.nextLine();
	     
	     System.out.print("DATA DE ENCERRAMENTO DE VIGENCIA DO CONTRATO: ");
	     DATASAIDA = sc.nextLine();
	     
	     System.out.print("VALOR DO ALUGUEL: R$");
	     VALORALUGUEL = sc.nextDouble();
	     System.out.print("VALOR ALUGUEL ESCRITO POR EXTENSO: ");
	     VALOREXTENSO = sc.nextLine();
	     sc.nextLine();
	     
	     System.out.print("DIA DE VENCIMENTO DO ALUGUEL: ");
	     DATAVENC = sc.nextLine();
	     System.out.print("DIA DE VENCIMENTO DO ALUGUEL ESCRITO POR EXTENSO: ");
	     DATAVENCEXT = sc.nextLine();
	    
	     System.out.println("");
	     System.out.println("");  
	     	     
	     System.out.printf("CONTRATO DE LOCAÇÃO RESIDENCIAL%n%nPelo presente Instrumento Particular,%n");
	     System.out.printf("%n%s, inscrita no CPF %s e RG %s,%n%s, %s, data de nascimento %s, e-mail: %s.%n", NOMEPROP, CPFP, RGP, ESTADOCIVILP, PROFISSAOP, DATANASCP, EMAILP);
	     System.out.printf("%n%s, %s, inscrita no CPF sob o nº %s e RG %s, data de nascimento %s, %s, %s, doravante denominada LOCATÁRIA.%n", NOMECLIENTE, NACIONALIDADEC, CPFC, RGC, DATANASCC, ESTADOCIVILC, PROFISSAOC);
	     System.out.printf("%nEm conjunto designadas “Partes” e individualmente “Parte”, resolvem de mútuo acordo, celebrar o presente CONTRATO DE LOCAÇÃO DE IMÓVEL RESIDENCIAL,%n");
	     System.out.println("que será regido pela legislação vigente e pelas cláusulas, termos e condições que seguem.");
	     System.out.println("");
	     System.out.println("DO OBJETO DO CONTRATO");
	     System.out.println("");
	     System.out.println("Cláusula 1ª – LOCADORA dá em locação à LOCATÁRIA, o imóvel de sua propriedade, situado");
	     System.out.printf("na %s, CEP: %s – %s, São Paulo-SP%n", ENDERECO, CEP, CIDADE);
	 
	     System.out.printf("%nDO PRAZO DE LOCAÇÃO%n");
	     
	     System.out.print("%nCláusula 2ª – O período de vigência do Contrato será de 30 (trinta) meses, a iniciar-se no dia ");
	     System.out.printf("%s e a se encerrar em %s. Após o 12º (décimo segundo) mês de vigência da ", DATAENTRADA, DATASAIDA);
	     System.out.print ("locação o Locatário poderá rescindir o presente contrato sem o pagamento de multa, devendo ");
	     System.out.println("comunicar a administradora por escrito com 30 (trinta) dias de antecedência");
	     System.out.printf("%nCláusula 3ª – Findo o prazo previsto no caput da cláusula 2ª, o Imóvel deverá ser devolvido nas ");
	     System.out.println("mesmas condições que a LOCATÁRIA recebeu, efetivando-se com a entrega das chaves.");
	     System.out.printf("%nCláusula 4ª – Caso a LOCATÁRIA não restitua o Imóvel no fim do prazo contratual, pagará, ");
	     System.out.print("enquanto estiver na posse do Imóvel, o aluguel mensal reajustado nos termos do quanto disposto ");
	     System.out.println("neste Contrato, até a efetiva desocupação e entrega das chaves do Imóvel.");
	     System.out.printf("%nCláusula 5ª – A falta de pagamento dos aluguéis e encargos por período inferior a 30 dias, por si ");
	     System.out.print("só, constituirá a LOCATÁRIA em mora, nos termos da Cláusula 6ª do Contrato, ");
	     System.out.print("independentemente de qualquer aviso, notificação ou interpelação, sem prejuízo da incidência de ");
	     System.out.println("juros, multas e correções monetárias previstas neste Contrato.");
	     
	     System.out.printf("%nDO VALOR DO ALUGUEL, DESPESAS E TRIBUTOS%n");
	     
	     System.out.printf("%nCláusula 6ª – A LOCATÁRIA se compromete a pagar o aluguel no valor de R$ %.2f (%s reais)%n", VALORALUGUEL, VALOREXTENSO);
	     System.out.printf("pontualmente todo dia $s (%s) de cada mês vencido, bem como correção monetária,%n", DATAVENC, DATAVENCEXT);
	     System.out.println("prevista no presente contrato, e após decorrido o período previsto na Cláusula 5ª");
	     System.out.println("arcará com uma multa de 10% (dez por cento) sobre o valor devido mais juros de 1%");
	     System.out.println("(um por cento) ao mês limitado a 90 (noventa) dias, quando ocorrerá a rescisão do Contrato.");
	     
	     
    sc.close();
	}

}