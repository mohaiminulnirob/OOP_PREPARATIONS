package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String args[]){
//Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
//HashSet class implements Set Interface.
// It represents the collection that uses a hash table for storage.
// Hashing is used to store the elements in the HashSet. It contains unique items.