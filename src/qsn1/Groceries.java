package qsn1;
import java.util.Date;
class Groceries extends Product {
    private Date expiryDate;
    public Groceries(int productId, String productName, int price, Date expiryDate) {
        super(productId, productName, price);
        this.expiryDate = expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " Expiry Date: " + expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.02;
    }

    public String checkFreshness() {
        Date currentDate = new Date();
        return (expiryDate.after(currentDate)) ? "Fresh" : "Expired";
    }
}

