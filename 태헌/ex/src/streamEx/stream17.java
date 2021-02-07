package streamEx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// collect() :  최종 처리 기능으로 요소들을 수집 or 그룹화
// collect(Collector<T, A, R> collector)
public class stream17 {
    public static void main(String[] args) {
        List<student2> totalList = Arrays.asList(
                new student2("김태헌", 15, student2.Sex.MALE),
                new student2("서환건", 16, student2.Sex.MALE),
                new student2("김용래", 17, student2.Sex.MALE),
                new student2("기연지", 18, student2.Sex.FEMALE),
                new student2("심민우", 19, student2.Sex.MALE),
                new student2("기연지2", 20, student2.Sex.FEMALE)
        );

        //남성
        List<student2> maleList = totalList.stream()
                .filter(s -> s.getSex() == student2.Sex.MALE)
                .collect(Collectors.toList());
        maleList.forEach(s -> System.out.println(s.getName()));

        //여성
        Set<student2> femaleSet = totalList.stream()
                .filter(s -> s.getSex() == student2.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
        femaleSet.forEach(s -> System.out.println(s.getName()));
    }

}
