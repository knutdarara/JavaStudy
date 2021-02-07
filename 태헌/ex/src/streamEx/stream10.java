package streamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class stream10 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        //asDoubleStream 사용해서 int > double
        IntStream intStream = Arrays.stream(intArray);
        intStream.asDoubleStream().forEach(System.out::println);

        System.out.println();

        //boxed() :
        intStream = Arrays.stream(intArray);
        intStream.boxed().forEach(System.out::println);
    }

}
