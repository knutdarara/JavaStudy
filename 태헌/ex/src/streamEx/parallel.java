package streamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//public class parallel {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("홍길동","신용권","김남준","람다식","병렬처리");
//
//        Stream<String> stream = list.stream();
//        stream.forEach(parallel::print);
//
//        Stream<String> parallelStream = list.parallelStream();
//        parallelStream.forEach(parallel::print);
//
//}
//    public static void print(String string) {
//        System.out.println(string + " : " + Thread.currentThread().getName());
//    }
//}
public class parallel {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동","신용권","김남준","람다식","병렬처리","123","2323","23232323");

        Stream<String> stream = list.stream();
        stream.forEach(parallel::print);

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(parallel::print);
    }
    public static void print(String string) {
        System.out.println(string + " : " + Thread.currentThread().getName());
    }
}


