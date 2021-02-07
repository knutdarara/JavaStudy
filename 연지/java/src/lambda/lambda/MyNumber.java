package lambda;

@FunctionalInterface //메서드 하나만 선언 할 수 있다. 오류 방지
public interface MyNumber {
    int getMax(int num1, int num2); //추상 메서드 선언
}
