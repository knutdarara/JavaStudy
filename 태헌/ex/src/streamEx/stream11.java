package streamEx;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;
import java.lang.Comparable;



//정렬기능 sorted()
public class stream11 {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{5, 3, 2, 1, 4,7,0});

        intStream.sorted().forEach(n -> System.out.print(n + ","));
        System.out.println();
//        intStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<String> langs =
                Arrays.asList("a", "dd", "ccc", "jjjava", "eclips");
        System.out.println("sorted:");
        langs.stream().sorted()
                .forEach(System.out::println);

        System.out.println("reversed:");
        langs.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


//        List<student> studentList = Arrays.asList(
//                new student("홍설", 80),
//                new student("신사임당", 93),
//                new student("이준", 45)
//        );
//
//        studentList.stream()
//                .sorted()
//                .forEach(student -> System.out.print(student.getScore() + ","));
//        System.out.println();

//        studentList.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(student -> System.out.print(student.getScore() + ","));

    }

}
