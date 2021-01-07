package study_class.trans;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    // 모든 버스는 번호를 가지고 있어야한다. 그럴때 콘스트럭터를 생성함
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }
    // 승객을 태웠을 때 호출되는 메서드
    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void showInfo(){
        System.out.println("버스 " + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은"+ money+ "입니다");
    }
}
