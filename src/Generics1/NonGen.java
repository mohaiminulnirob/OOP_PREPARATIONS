package Generics1;

public class NonGen {
    private Object o;
    NonGen(Object o){
        this.o=o;
    }

    public Object geto() {
        return o;
    }
    public void showType(){
        System.out.println(o.getClass().getName());
    }

    public static void main(String[] args) {
        NonGen iob=new NonGen(88);
        int a=(Integer)iob.geto();//type casting needed
        iob.showType();
        System.out.println(a);
        //strob=iob   runtime error
    }
}
