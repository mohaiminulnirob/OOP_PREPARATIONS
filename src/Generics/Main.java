package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T extends Number> void PrintList(T[] elements){
//        for(T element:elements)
//            System.out.println(element);
        for(int i=0;i<elements.length;i++)
            System.out.println(elements[i]);
    }
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
        }
    }
    public static void main(String[] args) {
        GenericClass<Double> d = new GenericClass<Double>();
        d.setObj(1.5);
        double d1 = d.getObj();
        System.out.println(d1);
        Integer intArray[] = {0, 1, 1, 3};
        PrintList(intArray);
        String[] strings = {"abc", "pqr"};
        // PrintList(strings);//string is not in Number class.
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        List<Square> list3 = new ArrayList<>();
        list3.add(new Square());

        drawShapes(list1);
        drawShapes(list2);
        //drawShapes(list3);//square class doesn't implement Shape
    }
}
//lab 13
