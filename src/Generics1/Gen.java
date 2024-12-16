package Generics1;

public class Gen<T>{
    T ob;
    Gen(T ob){
        this.ob=ob;
    }
    public T getOb(){
        return ob;
    }
    public void showType(){
        System.out.println(ob.getClass().getName());
    }
}
