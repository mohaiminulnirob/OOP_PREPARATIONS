package qsn1;

public abstract class Product {
    private int productId;
    private String productName;
    private int price;
    public Product(int ProductId,String productName,int price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getDetails(){

        return "productId: "+productId +" productName: "+productName+" Price: "+price;
    }
    abstract double calculateDiscount();
}
