package br.com.Polimorfismo.exercicios.fixacao;

public class ImportedProduct extends Product{
    private Double customsFee;

    public Double totalPrice() {
        return price + customsFee;
    }

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + totalPrice() + " " + String.format("(Customs fee: $ %.2f)", customsFee);
    }
}
