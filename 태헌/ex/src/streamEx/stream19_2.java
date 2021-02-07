package streamEx;
import java.util.Arrays;
import java.util.List;

// 병렬처리
public class stream19_2 {
    public static void main(String[] args) {
        List<student2> totalList = Arrays.asList(
                new student2("김태헌", 15, student2.Sex.MALE, student2.City.INCHEON),
                new student2("서환건", 16, student2.Sex.MALE, student2.City.GWANGJU),
                new student2("김용래", 17, student2.Sex.MALE, student2.City.GWANGJU),
                new student2("기연지", 18, student2.Sex.FEMALE, student2.City.GWANGJU),
                new student2("심민우", 19, student2.Sex.MALE, student2.City.GWANGJU),
                new student2("기연지2", 20, student2.Sex.FEMALE, student2.City.GWANGJU)
        );

        System.out.println("람다");
        stream19 maleStudentListLambda = totalList.parallelStream()
                .filter(s -> s.getSex() == student2.Sex.MALE)
                .collect(
                        () -> new stream19(),
                        (r, t) -> r.accumulate(t),
                        (r1, r2) -> r1.combine(r2));
        maleStudentListLambda.getList().stream().forEach(s -> System.out.println(s.getName()));

        System.out.println("\n메소드 참조");
        stream19 maleStudentListMethodReference = totalList.parallelStream()
                .filter(s -> s.getSex() == student2.Sex.MALE)
                .collect(stream19::new, stream19::accumulate, stream19::combine);
        maleStudentListMethodReference.getList().stream().forEach(s -> System.out.println(s.getName()));
    }
}
