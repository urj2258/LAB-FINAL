import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    public List<Product> fetchProductDetails(String keyword) {
        List<Product> products = new ArrayList<>();
        // Simulate fetching products based on keyword
        products.add(new Product(1, "Laptop", 800.00f));
        products.add(new Product(2, "Smartphone", 500.00f));
        products.add(new Product(3, "Headphones", 50.00f));
        return products;
    }
}