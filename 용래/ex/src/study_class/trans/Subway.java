package study_class.trans;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    // 모든 버스는 번호를 가지고 있어야한다. 그럴때 콘스트럭터를 생성함
    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }
    // 승객을 태웠을 때 호출되는 메서드
    public void take(int money){
        this.money += money;
        passengerCount++;
    }
    public void showInfo(){
        System.out.println("지하철 " + lineNumber + "의 승객은" + passengerCount + "명이고, 수입은"+ money+ "입니다");
    }
}
