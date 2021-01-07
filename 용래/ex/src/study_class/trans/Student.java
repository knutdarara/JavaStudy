package study_class.trans;

public class Student {
    String studentName;
    int grade;
    int money;
    // 콘스트럭터 = 이게 있어야 생성할수 있다라고 선언하면 이거로만 생성가능
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
                       //버스에 대한 정보
    public void takeBus(Bus bus){
        bus.take(1000);
        money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1500);
        money -= 1500;
    }

//    public void takeTans(Trans trans){
//        System.out.println("뭐였지...");
//    }

    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
    }
}
