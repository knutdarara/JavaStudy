package streamEx;
import java.util.Arrays;
import java.util.List;

//reduce() 메소드 : 다양한 집계의 결과를 만듬.
public class stream16 {
    public static void main(String[] args) {
        List<student> studentList = Arrays.asList(
                new student("심민우", 100),
                new student("김용래", 95),
                new student("백성준", 90)
        );

        int sum1 = studentList.stream()
                .mapToInt(student::getScore)
                .sum();

        int sum2 = studentList.stream()
                .mapToInt(student::getScore)
                .reduce((a, b) -> a + b)
                .getAsInt();

        int sum3 = studentList.stream()
                .mapToInt(student::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1: " + sum1);
        System.out.println("sum2: " + sum2);
        System.out.println("sum3: " + sum3);
    }
}
