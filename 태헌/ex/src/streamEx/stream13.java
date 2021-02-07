package streamEx;

import java.util.Arrays;

// 최종 연산 matching : 최종 처리 기능으로 요소들이 특정 조건을 만족하는지 조사하는 것

public class stream13 {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 6};

        // allMatch : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사
        boolean result = Arrays.stream(intArray).allMatch(a -> a % 2 == 0);
        System.out.println("모두 2의 배수인가? " + result);

        result = Arrays.stream(intArray).anyMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 있는가? " + result);

        result = Arrays.stream(intArray).noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 없는가? " + result);
    }
}
