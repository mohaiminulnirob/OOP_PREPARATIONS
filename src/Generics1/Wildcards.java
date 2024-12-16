package Generics1;

public class Wildcards<T extends Number> {
    T[] nums;
    Wildcards(T[] nums){
        this.nums=nums;
    }
    public double avg(){
        double s=0;
        for(T num:nums){
            s+=num.doubleValue();//if Number is not extended, doubleValue() function will not work
        }
        return s/nums.length;
    }
    public boolean sameAvg(Wildcards<?> o){//wildcard is used
        if(this.avg()==o.avg())
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Integer[] arr={0,1,2,3};
        Double[] arr1={0.0,1.0,2.0,3.0};
        Wildcards<Integer> o=new Wildcards<Integer>(arr);//object of Integer
        Wildcards<Double> o1=new Wildcards<Double>(arr1);//object of Double
        System.out.println(o.avg());
        System.out.println(o.sameAvg(o1));
    }
}
