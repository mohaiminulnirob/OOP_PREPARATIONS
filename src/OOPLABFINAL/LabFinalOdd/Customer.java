package OOPLABFINAL.LabFinalOdd;

public class Customer {
    private int customerID;
    private String customerName;
    private String address;
    private int phone;
    private Order order;

    public Customer(int customerID, String customerName, String address, int phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addCustomer() {
        System.out.println("Customer added: " + customerName);
    }

    public void editCustomer() {
        System.out.println("Customer details updated.");
    }

    public void deleteCustomer() {
        System.out.println("Customer deleted.");
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
