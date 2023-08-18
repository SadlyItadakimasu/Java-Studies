package ProgramAndEntities.application.entities;

public class PessoaFisica extends Contribuintes{
    private Double gastosSaude;

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica(String name, Double salarioanual, Double gastosSaude) {
        super(name, salarioanual);
        this.gastosSaude = gastosSaude;
    }
    @Override
    public Double imposto(){
        Double x;
        if (getSalarioanual() < 20000.00){
            x = getSalarioanual()*(0.15);
        }
        else {
            x = getSalarioanual()*(0.25);
        }
            x = x - gastosSaude*0.5;

        return x;
    }
    @Override
    public String toString(){
        return getName()+
                String.format(": $ %.2f", imposto());
    }
}
