package singleton;

public class Company {
    private static Company instance = new Company(); //유일하게 생성한 인스턴스
    private Company() {} //외부 클래스에서 인스턴스 생성 불가, 내부 클래스에서만 생성 제어 가능

    public static Company getInstance( ) { //인스턴스 외부에서 참조가능
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
