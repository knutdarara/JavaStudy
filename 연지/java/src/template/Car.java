package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    //템플릿 메서드 - 메서드 실행 순서와 시나리오 정의
    //로직 흐름이 이미 정해져 있는 프레임 워크에서 많이 사용하는 기본 구현 방법
    //상위 클래스를 상속받은 하위 클래스에서 템플릿 메서드 재정의 할 수 없다. > final 예약어 사용
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
