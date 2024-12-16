package qsn1;
import java.util.ArrayList;
import java.util.List;
class ShoppingCart {
    private List<Product> products;
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice() - product.calculateDiscount();
        }
        return totalCost;
    }
    public void listProducts() {
        for (Product product : products) {
            System.out.println(product.getDetails());
        }
    }
}
