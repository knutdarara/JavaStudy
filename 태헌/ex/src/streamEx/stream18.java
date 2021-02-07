package streamEx;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//요소를 그릅화해서 수집

public class stream18 {
    public static void main(String[] args) {

        List<student2> totalList = Arrays.asList(
                new student2("김태헌", 15, student2.Sex.MALE, student2.City.INCHEON),
                new student2("서환건", 16, student2.Sex.MALE, student2.City.GWANGJU),
                new student2("김용래", 17, student2.Sex.MALE, student2.City.GWANGJU),
                new student2("기연지", 18, student2.Sex.FEMALE, student2.City.GWANGJU),
                new student2("심민우", 19, student2.Sex.MALE, student2.City.GWANGJU),
                new student2("기연지2", 20, student2.Sex.FEMALE, student2.City.GWANGJU)
        );

// 성별로 그룹화
        Map<student2.Sex, List<student2>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(student2::getSex));


        System.out.println("[남학생]");
    mapBySex.get(student2.Sex.MALE)
            .forEach(s -> System.out.print(s.getName() + " "));
    System.out.println("\n[여학생]");
    mapBySex.get(student2.Sex.FEMALE)
            .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println();
////////////// 도시별 그룹화
        Map<student2.City, List<String>> mapByCity = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                student2::getCity,
                                Collectors.mapping(student2::getName, Collectors.toList())
                        )
                );


        System.out.println("\n[인천]");
    mapByCity.get(student2.City.INCHEON)
            .forEach(name -> System.out.print(name + " "));
    System.out.println("\n[광주]");
    mapByCity.get(student2.City.GWANGJU)
            .forEach(name -> System.out.print(name + " "));

    ///////////////////
    }
}


