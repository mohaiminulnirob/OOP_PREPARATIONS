package Generics1.BoundedWildcards;

public class Coords<T extends TwoD>{
    T[] coords;
    Coords(T[] coords){
        this.coords=coords;
    }
}
