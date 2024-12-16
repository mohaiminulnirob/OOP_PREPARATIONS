package CollectionFramework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String args[]){
        List<String> list=new ArrayList(5);//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(list.get(1));
        System.out.println(list);//printed using to_string of AbstractCollection
        String[] s=new String[list.size()];
        s=list.toArray(s);
    }
}
//The ArrayList class implements the List interface.
// It uses a dynamic array to store the duplicate element of different data types.
// The ArrayList class maintains the insertion order and is non-synchronized.
// The elements stored in the ArrayList class can be randomly accessed.
//3 constructors
//ensureCapacity, trimToSize
//obtaining an array from arraylist