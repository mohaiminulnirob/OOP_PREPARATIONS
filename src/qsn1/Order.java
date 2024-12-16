package qsn1;

class Order {
    private int orderId;
    private String customerName;
    private ShoppingCart cart;

    public Order(int orderId, String customerName, ShoppingCart cart) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.cart = cart;
    }

    public String getOrderDetails() {
        return "Order ID: " + orderId + ", Customer: " + customerName + "\nCart Details: " + cart.calculateTotalCost();
    }


    public void placeOrder() {
        System.out.println("Order placed for " + customerName);
        System.out.println("Total cost: $" + cart.calculateTotalCost());
    }

    public void cancelOrder() {
        System.out.println("Order cancelled for " + customerName);
        cart = new ShoppingCart();
    }
}

