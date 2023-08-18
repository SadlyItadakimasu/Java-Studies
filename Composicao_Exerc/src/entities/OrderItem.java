package entities;

public class OrderItem {
    private Product product;
    private Integer quantity;
    private Double price;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public OrderItem(Product product, int quantity, Double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderItem() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "%s, $%.2f, Quantity: %d, Subtotal: %.2f%n".formatted(product.getName(), product.getPrice(), quantity, subTotal());
    }

    public Double subTotal(){
        return quantity*price;
    }
}
