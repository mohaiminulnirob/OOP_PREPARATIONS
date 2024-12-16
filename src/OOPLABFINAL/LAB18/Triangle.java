package OOPLABFINAL.LAB18;

public class Triangle extends Area {

    public Triangle(double base, double height) {
        super(base, height);
        System.out.println("Triangle object is created.");
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void displayArea() {
        System.out.println("The area of the Triangle is: " + calculateArea());
    }
}
