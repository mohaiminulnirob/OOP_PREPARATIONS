package qsn1;

import java.util.ArrayList;
import java.util.List;
class OrderManager {
    private List<Order> orders;
    public OrderManager() {
        orders = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orders.add(order);
    }
    public void removeOrder(Order order) {
        orders.remove(order);
    }
    public void listAllOrders() {
        for (Order order : orders) {
            System.out.println(order.getOrderDetails());
        }
    }
    public Order getOrderById(int orderId) {
        for (Order order : orders) {
            if (orderId == orderId) {
                return order;
            }
        }
        return null;
    }
}

