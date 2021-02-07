package streamEx;


import java.util.Arrays;
import java.util.List;

//flatMapXXX()메소드 : 한 개의 요소를 대체하는 복수개의 요소들로 구성된 새로운 스트림을 리턴한다.

public class stream08 {
    public static void main(String[] args) {
        List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");

        inputList1.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(System.out::println);

        System.out.println();

        List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
        inputList2.stream()
                .flatMapToInt(data -> {
                    String[] strArray = data.split(",");
                    int[] intArray = new int[strArray.length];
                    for (int i = 0; i < strArray.length; i++) {
                        intArray[i] = Integer.parseInt(strArray[i].trim());
                    }
                    return Arrays.stream(intArray);
                })
                .forEach(System.out::println);
    }
}
