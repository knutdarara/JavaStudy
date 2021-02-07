package streamEx;
import java.util.Arrays;

// Aggregate : 최종 처리기능 , 카운팅, 합계, 평균값,최대값,최소값 등과 같이 하나의 값으로 산출
//  대량의 데이터를 가공해서 축소하는 리덕션(reduction)
// 스트림이 제공하는 기본 집계 함수
public class stream14 {
    public static void main(String[] args) {
        long count = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .count(); // 요소의 개수
        System.out.println("2의 배수의 수: " + count);

        long sum = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2의 배수의 합: " + sum);

        int max = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("2의 배수 중 최대값: " + max);

        int min = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("2의 배수 중 최소값: " + min);

        int first = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 3의 배수: " + first);
    }
}
