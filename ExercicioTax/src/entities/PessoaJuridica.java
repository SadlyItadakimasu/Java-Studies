package ProgramAndEntities.application.entities;

public class PessoaJuridica extends Contribuintes{
    private Integer numeroFuncionarios;

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public PessoaJuridica(String name, Double salarioanual, Integer numeroFuncionarios) {
        super(name, salarioanual);
        this.numeroFuncionarios = numeroFuncionarios;
    }
    @Override
    public Double imposto(){
        Double total;
        if (numeroFuncionarios < 10){
            total = getSalarioanual()*0.16;
        }
        else {
            total = getSalarioanual()*0.14;
        }
        return total;
    }
    @Override
    public String toString(){
        return getName()+
                String.format(": $ %.2f", imposto());

    }
}
