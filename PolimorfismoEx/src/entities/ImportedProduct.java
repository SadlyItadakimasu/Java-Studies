package entities;

public class ImportedProduct extends Product{
    private Double customsFee;
    public Double totalPrice(){
        return getPrice()+customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public String priceTag(){
        return getName()+
                " $ "+
                totalPrice()+
                " (Customs fee: "+
                customsFee+
                ")";
    }

}
