package membrosestaticos;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price?: ");
		double dollar = sc.nextDouble();
		CurrencyConverter dollar1 = new CurrencyConverter(dollar);
		
		System.out.print("How many dollars will be bought?: ");
		double quantity = sc.nextDouble();
		double result = quantity*dollar1.getDollar()+(0.06*(quantity*dollar1.getDollar()));
		System.out.printf("Amount to be paid in reais: %.2f", result);
		sc.close();
		
		Pessoa n = new Pessoa();
		n.setNome("guilherme");
		n.setCpf("111.111.111.11");
		System.out.println(n.getNome());
		Pessoa x = new Pessoa("felipe", "112.122.123.12");
		System.out.println(x.getNome());

		x.setNome("juliana");
		System.out.println(x.getNome());
			
		
	}

}
