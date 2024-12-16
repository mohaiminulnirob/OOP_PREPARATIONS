package Generics1;

public class BoundedGenerics<T extends Number> {
    T[] nums;
    BoundedGenerics(T[] nums){
        this.nums=nums;
    }
    public double avg(){
        double s=0;
        for(T num:nums){
            s+=num.doubleValue();//if Number is not extended, doubleValue() function will not work
        }
        return s/nums.length;
    }

    public static void main(String[] args) {
        Integer[] arr={0,1,2,3};
        BoundedGenerics o=new BoundedGenerics(arr);
        System.out.println(o.avg());
    }
}
