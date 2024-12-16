package OOPLABFINAL.LabFinalOdd;

public class Product {
    private int productID;
    private float productPrice;
    private String productType;

    public int getProductID() {
        return productID;
    }

    public Product(int productID, float productPrice, String productType) {
        this.productID = productID;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public void addProduct() {
        System.out.println("Product added: " + productType);
    }

    public void modifyProduct(int productID) {
        this.productID=productID;
    }

    public void selectProduct(int productID) {
        System.out.println("Product selected with ID: " + productID);
    }
}
