package OOPLABFINAL.LabFinalOdd;

public class Stock {
    private Product product;
    private int quantity;
    private int shopNo;


    public void addStock() {
    }

    public Stock(Product product, int quantity, int shopNo) {
        this.product = product;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public void modifyStock(int productId) {
        product.modifyProduct(productId);
    }

    public void selectStockItem(int productId) {
        if(this.product.getProductID()==productId){
            System.out.println("Product is selected");
        }
    }
}
