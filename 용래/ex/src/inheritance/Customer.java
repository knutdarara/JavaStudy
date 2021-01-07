package inheritance;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    // 일반적으로 가입하는 고객 등급은 SILVER

//    public Customer(){
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//
//        System.out.println("Customer 호출");
//    }


    // Customer라는 콘스트럭터가 생성될 때 아이디와 이름을 반드시 받는다는 의미
    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) 호출");
    }

    // 포인트 적립
    public int calcPrice(int price) {
        if (customerGrade == "SILVER") {
            bonusPoint += price * bonusRatio;
        }
        return price;
    }
    // 회원정보
    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
    public void setBonusPoint(int bonusPoint){
        this.bonusPoint = bonusPoint;
    }
}
