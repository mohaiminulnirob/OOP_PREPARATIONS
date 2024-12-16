package qsn1;

class Electronics extends Product {
    private int warrantyPeriod;
    public Electronics(int productId, String productName, int price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod=warrantyPeriod;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    @Override
    public String getDetails() {
        return super.getDetails() + ", Warranty: " + warrantyPeriod + " months";
    }
    @Override
    public double calculateDiscount() {
        return getPrice()*0.10;
    }
    public void applyWarranty() {
        System.out.println("Warranty applied for " + getProductName() + " for " + warrantyPeriod + " months/years");
    }
}

