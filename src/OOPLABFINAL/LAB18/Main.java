package OOPLABFINAL.LAB18;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        triangle.displayDimensions();
        triangle.displayArea();

        System.out.println();

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.displayDimensions();
        rectangle.displayArea();
    }
}
