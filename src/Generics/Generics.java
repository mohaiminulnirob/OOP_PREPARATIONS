package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer>IA= new ArrayList<>();
        IA.add(10);
        ArrayList<String>SA=new ArrayList<>();
        SA.add("Laiba");
        IA.add(5);
        SA.add("Linta");
        for(Integer i:IA)
            System.out.println(i);
//        for(String s:SA)
//            System.out.println(s);
        Iterator<String> it= SA.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(SA.get(0));
        //ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc
        //are built in generic collection classes.
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Nirob");
        map.put(2,"Linta");
        map.put(3,"Laiba");
        for( Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
    }
}
//Advantage of Java Generics
//1) Type-safety: We can hold only a single type of objects in generics.
// It doesn?t allow to store other objects.
//2) Type casting is not required: There is no need to typecast the object.
//3) Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
// The good programming strategy says it is far better to handle the problem at compile time than runtime.
//4) reuse
//T - Type
//E - Element
//K - Key
//N - Number
//V - Value
//generic method
//using wildcards
//The ? (question mark) symbol represents the wildcard element. It means any type.
// If we write <? extends Number>,it means any child class of Number, e.g., Integer, Float, and double.
// Now we can call the method of Number class through any child class object
//We can use a wildcard as a type of a parameter, field, return type, or local variable.
// However, it is not allowed to use a wildcard as a type argument for a generic method invocation,
// a generic class instance creation,or a supertype
//Upper Bounded Wildcards
//The purpose of upper bounded wildcards is to decrease the restrictions on a variable.
// It restricts the unknown type to be a specific type or a subtype of that type.
// It is used by declaring wildcard character ("?") followed by the extends (in case of, class)
// or implements (in case of, interface) keyword, followed by its upper bound.
//Syntax
//List<? extends Number>
//Lower Bounded Wildcards
//The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a supertype of that type.
// It is used by declaring wildcard character ("?") followed by the super keyword, followed by its lower bound.
//Syntax
//List<? super Integer>
//lab 13
