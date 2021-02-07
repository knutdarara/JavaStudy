package innerclass;

class OutClass {                        //외부클래스
    private int num = 10;               //외부 클래스 private 변수
    private static int sNum = 20;       //외부 클래스 정적 변수

    private InClass inClass;            //내부 클래스 자료형 변수 선언

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {                     //인스턴스 내부 클래스 << 외부 클래스 생성이후에 사용, 정적변수와 정적메서드 선언 불가능
        int inNum = 100;                //내부 클래스의 인스턴스 변수
        //static int sInNum = 200; 인스턴스 내부에 정적 변수 선언 불가능

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }
        //static void sTest() { 인스턴스 내부에 정적메서드 정의 불가능
        //}
    }
    public void usingClass() {
        inClass.inTest();
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스를 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();      //내부 클래스 기능 호출
    }
}