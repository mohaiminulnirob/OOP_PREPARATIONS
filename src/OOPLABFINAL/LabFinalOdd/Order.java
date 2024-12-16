package OOPLABFINAL.LabFinalOdd;

public class Order {
    private int orderID;
    private Customer customer;
    private Product product;
    private float amount;
    private String orderDate;

    public Order(int orderID,Customer customer, Product product, float amount, String orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public void createOrder() {
        System.out.println("Order created for Customer: " + customer.getCustomerName());
    }

    public int getOrderID() {
        return orderID;
    }

    public void editOrder(int orderID) {
        System.out.println("Order with ID " + orderID + " has been updated.");
    }
}
