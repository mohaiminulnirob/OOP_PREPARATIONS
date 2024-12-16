package lab9;

public class Main {
    public static void main(String[] args) {
        Polygon p;
        p=new Square(10);
        System.out.println(p.getArea());
        System.out.println(p.getType());
        p=new Rectangle(10,20);
        System.out.println(p.getArea());
        System.out.println(p.getType());
    }
}
