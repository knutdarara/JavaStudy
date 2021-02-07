package streamEx;

import java.util.Arrays;
import java.util.List;

public class stream06 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("서환건", Member.MALE, 30),
                new Member("기연지", Member.FEMALE, 24),
                new Member("김태헌", Member.MALE, 26),
                new Member("김용래", Member.MALE, 26),
                new Member("가나다", Member.MALE, 20)
        );

        //중간처리 필터
       double avg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
        System.out.println("남자 평균 나이: " + avg);
    }
}

