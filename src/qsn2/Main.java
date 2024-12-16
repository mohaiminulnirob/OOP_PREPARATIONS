package qsn2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        int[] numbers = {12, 7, 5, 19, 23, 8, 4, 15, 3, 10};
        List<Integer> result = Arrays.stream(numbers)
                .filter(n -> n >= 10)
                .map(n -> n * 2)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
