package Generics1;



public class GenericMethod {
    static <T,V extends T> boolean isIn(T[] nums, V num){// generic method can be static or non-static
        for(T n:nums){
            if(n==num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums={0,1,2,3};
        Integer num=1;
        System.out.println(isIn(nums,num));
    }
}
