package br.com.composicao.exercicio.classes;

public class OrderItem {
    private int quantity;
    private float price;

    private Product product;

    public OrderItem(int quantity, float price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public OrderItem() {

    }

    public float subTotal() {
        return this.price * this.quantity;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.product.getName()).append(", ");
        sb.append("$").append(this.price).append(", ");
        sb.append("Quantity: ").append(this.quantity).append(", ");
        sb.append("Subtotal: ").append("$ ").append(this.subTotal());

        return sb.toString();
    }
}
