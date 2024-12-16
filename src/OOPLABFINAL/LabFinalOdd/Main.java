package OOPLABFINAL.LabFinalOdd;

public class Main {
    public static void main(String[] args) {
        Customer c1= new Customer(123,"Nirob","Sylhet,BD",01712);
        Product product1 = new Product(1, 99.99f, "Electronics");
        Product product2= new Product(2,200,"Book");
        Stock s1= new Stock(product1,100,12);
        Stock s2= new Stock(product2,200,32);
        Order o1=new Order(12345,c1,product1,2,"11/12/24");

        s1.selectStockItem(1);
        System.out.println("Order ID: "+o1.getOrderID());
    }
}
