package streamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


// 중간처리와 최종 처리
public class stream03 {
    public static void main(String[] args) {

        List<student> list = Arrays.asList(
                new student("홍길동", 92),
                new student("김태헌",80),
                new student("김자바", 82),
                new student("김바바", 85)
        );

        double avg = list.stream().mapToInt(student::getScore).average().getAsDouble();

        System.out.println("평균점수: " + avg);
    }
}
