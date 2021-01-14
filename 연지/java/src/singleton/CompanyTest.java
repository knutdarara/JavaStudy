package singleton;

public class CompanyTest {
    public static void main(String[ ] args) {
        Company myCompany1 = Company.getInstance();
        Company myCompany2 = Company.getInstance();
        System.out.println(myCompany1 == myCompany2); //같은 주소의 인스턴스 주소 반환
    }
}
