package qsn1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(1, "Laptop",1000,2);
        Clothing shirt = new Clothing(2, "Shirt", 50,"M","Blue");
        Groceries apple = new Groceries(3, "Apple", 3, new Date());
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(shirt);
        cart.addProduct(apple);
        Order order = new Order(101, "John Doe", cart);
        order.placeOrder();
        cart.listProducts();
        OrderManager manager = new OrderManager();
        manager.addOrder(order);
        manager.listAllOrders();
    }
}
