package OOPLABFINAL.LAB18;

public class Rectangle extends Area {

    public Rectangle(double base, double height) {
        super(base, height);
        System.out.println("Rectangle object is created.");
    }

    public double calculateArea() {
        return base * height;
    }

    public void displayArea() {
        System.out.println("The area of the Rectangle is: " + calculateArea());
    }
}

