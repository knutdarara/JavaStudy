package streamEx;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class stream05 {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        //IntStream stream = IntStream.range(1, 100);   //범위에 100이 포함되지 않음
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);
    }

}
