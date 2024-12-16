package lab13;
import java.util.List;
import java.util.ArrayList;

public class LibraryInventory <T>{
    List<T>store;
    public LibraryInventory(){

        store =new ArrayList<>();
    }
    void addStore(T data){
        store.add(data);
    }
    List<T> getstore(){

        return store;
    }
}
