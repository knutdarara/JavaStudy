package streamEx;

import java.util.Arrays;
import java.util.List;

//mapXXX() 메소드 : 요소를 대체하는 요소로 구성된 새로운 스트림을 리턴한다.
public class stream09 {
    public static void main(String[] args) {
        List<student> studentList = Arrays.asList(
                new student("김길", 44),
                new student("김기", 99),
                new student("김리", 77)
        );
        studentList.stream()
                .mapToInt(student::getScore)
                .forEach(System.out::println);

    }
}
