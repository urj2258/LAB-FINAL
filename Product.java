public class Product {
    private int productId;
    private String name;
    private float price;

    public Product(int productId, String name, float price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getDetails() {
        return "ID: " + productId + ", Name: " + name + ", Price: " + price;
    }
}