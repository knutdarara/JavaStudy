package streamEx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class iteratorVSstream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "김남준");

        //자바 7 이전 코드
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //자바 8 이후 코드
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
