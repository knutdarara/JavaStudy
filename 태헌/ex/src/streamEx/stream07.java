package streamEx;

import java.util.Arrays;
import java.util.List;

public class stream07 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("기연지", "서환건","김영래", "김태헌", "김태헌", "김용래", "김용래","심민우");

        names.stream().distinct().forEach(System.out::println);
        System.out.println();

        names.stream().filter(str -> str.startsWith("김")).forEach(System.out::println);
        System.out.println();

        names.stream().distinct().filter(str -> str.endsWith("래")).forEach(System.out::println);
    }

}
