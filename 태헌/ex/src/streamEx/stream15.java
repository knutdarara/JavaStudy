package streamEx;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

//Optional : 값을 저장하는 값 기반 클래스
// 집계 값이 존재하지 않을 경우 디폴트 값을 설정가능
//
public class stream15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        // isPresent() : 값이 저장되어있는 여부를 확인
        //
        if(optional.isPresent()) {
            System.out.println("방법1 평균: " + optional.getAsDouble());
        } else {
            System.out.println("방법1 평균: 0.0");
        }

        // orElse(T) : 값이 저장되어 있지 않으면 디폴트값임.
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("orElse를 이용한 평균: " + avg);

        list.add(2);
        list.add(4);
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("isPresent를 이용한 평균: " + a));
    }

}
