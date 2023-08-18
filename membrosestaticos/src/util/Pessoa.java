package util;

public class Pessoa {
	
	private String nome;
	private String cpf;
	
	public Pessoa() {
		
	}
	
public Pessoa(String nome , String cpf) {
	this.nome = nome;
	this.cpf = cpf;
		
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}


}

private double rg;

public Pessoa(double rg) {
	this.rg = rg;
}

public void writedata(Pessoa person){
	System.out.println(person.cpf);
	System.out.println(person.nome);
	System.out.println(person.rg);
}
	//OU POSSO FAZER ASSIM (toString() e muito melhor aparentemente)
	
	public String toString() {
		return "CPF: "
			+cpf
			+", NOME: "
			+nome
			+", RG: "
			+rg;
	

}
}