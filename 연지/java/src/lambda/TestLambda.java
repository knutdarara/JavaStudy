package lambda;

interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s-> System.out.println(s); //람다식을 인터페이스형 변수에 대입하고 변수를 사용해 람다식 구현부 호출
        lambdaStr.showString("test");

        showMyString(lambdaStr); //메서드의 매개변수로 람다식을 대입한 변수 전달

        PrintString reStr = returnString();
        reStr.showString("hello");
    }
    public static void showMyString(PrintString p) { //매개변수를 인터페이스형으로 받음
        p.showString("test2");
    }
    public static PrintString returnString() {
        return s -> System.out.println( s+ "world");
    }
}
