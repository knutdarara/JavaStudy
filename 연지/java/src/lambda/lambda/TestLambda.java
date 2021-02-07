package lambda;

interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s-> System.out.println(s);
        lambdaStr.showString("test");

        showMyString(lambdaStr); //람다식을 대입한 변수 전달

        PrintString reStr = returnPrint();
        reStr.showString("hello");
    }
    public static void showMyString(PrintString p) {
        p.showString("test2");
    }
    public static PrintString returnPrint() {
        return s -> System.out.println(s + "world");
    }
}
