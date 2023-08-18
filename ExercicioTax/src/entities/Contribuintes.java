package ProgramAndEntities.application.entities;

public abstract  class Contribuintes {
    private String name;
    private Double salarioanual;

    public Contribuintes(String name, Double salarioanual) {
        this.name = name;
        this.salarioanual = salarioanual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Double getSalarioanual() {

        return salarioanual;
    }

    public void setSalarioanual(Double salarioanual) {

        this.salarioanual = salarioanual;
    }
    public abstract Double imposto();
}
