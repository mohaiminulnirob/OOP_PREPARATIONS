package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {
    public static int a;
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(3);
        Stream<Integer> myStream=list.stream();
        List<Integer> finalList=myStream.filter((n)->n%2==0)
                .map((n)->n*2)
                .collect(Collectors.toList());
        for(Integer i:finalList)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(a);

//        //int v=myStream.reduce(1,(a,b)->a*b);
//        Optional<Integer> minVal=myStream.min(Integer::compare);
//        Stream<Integer> myStream1=list.stream();
//        Optional<Integer> productValue =myStream1.reduce((a, b)->a*b);
//        if(minVal.isPresent()){
//            System.out.println("Minimum Value: "+ minVal.get());
//        }
//        if(productValue.isPresent()){
//            System.out.println("Product Value: "+ productValue.get());
//        }
//        Stream<Integer> sortedStream=list.stream().sorted();
//        sortedStream.forEach((n)-> System.out.print(n+" "));
//        System.out.println();
    }
}
