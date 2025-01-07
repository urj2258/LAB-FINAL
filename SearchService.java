import java.util.List;

public class SearchService {
    public List<Product> searchProduct(String keyword) {
        ProductDB productDB = new ProductDB();
        List<Product> products = productDB.fetchProductDetails(keyword);
        System.out.println("Products Found:");
        for (Product product : products) {
            System.out.println(product.getDetails());
        }
        return products;
    }
}