package OOPLABFINAL.LineLength;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(new Point(5, 6), new Point(7, 8));

        System.out.println(line1); // Output: Line @ (1.0, 2.0) to (3.0, 4.0)
        System.out.println("Length of line1: " + line1.getLength());

        System.out.println(line2); // Output: Line @ (5.0, 6.0) to (7.0, 8.0)
        System.out.println("Length of line2: " + line2.getLength());
    }
}
