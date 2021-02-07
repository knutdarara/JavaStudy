package streamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class stream04 {
    public static void main(String[] args) {

        //컬렉션에서 스트림얻기
        List<student> studentList = Arrays.asList(
                new student("홍길동", 10),
                new student("김길동", 20),
                new student("남길동", 30)
        );
        Stream<student> stream = studentList.stream();
        stream.forEach(s -> System.out.println(s.getName()));


        //배열에서 스트림 얻기
        String[] stringArray = {"홍길동", "신용권", "김미나"};
        Stream<String> stringStream = Arrays.stream(stringArray);
        stringStream.forEach(a -> System.out.print(a + ","));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a -> System.out.print(a + ","));
    }

}
