package qsn1;

class Clothing extends Product {
    private String size;
    private String color;
    public Clothing(int productId,String productName,int price,String size,String color) {
        super(productId,productName,price);
        this.size=size;
        this.color=color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String getDetails() {
        return super.getDetails() + ", Size: " + size + ", Color: " + color;
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
    public void returnItem() {
        System.out.println("Item returned: " + getProductName());
    }
}

