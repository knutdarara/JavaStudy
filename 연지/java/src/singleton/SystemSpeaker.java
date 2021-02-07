package singleton;

public class SystemSpeaker {
    //원래는 getter setter
    public int systemVol = 5;

    //2. private static 인스턴스 변수
    private static SystemSpeaker ss;

    //3. public static getInstance() method 구현
    public static SystemSpeaker getInstance(){

        if(ss==null){
            ss = new SystemSpeaker();
        }
        return ss;
    }
    // 1.private 생성자
    private SystemSpeaker(){

    }
}
