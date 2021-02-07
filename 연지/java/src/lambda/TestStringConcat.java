package lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2); //추상메서드 테스트
        
        //추상메서드를 클래스로 구현하지 않고 람다식으로 바로 메서드 구현
        //람다식 구현은 메서드를 하나만 포함하는 함수형 인터페이스만 가능
        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
        concat2.makeString(s1, s2);
    }
}
