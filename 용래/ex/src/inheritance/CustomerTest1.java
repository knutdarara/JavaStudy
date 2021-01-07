package inheritance;

import inheritance.Customer;
import inheritance.VIPCustomer;

public class CustomerTest1 {
    public static void main(String[] args){
        /*
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10100);
        customerLee.setCustomerName("Lee");
        */
        Customer customerKim = new VIPCustomer(10101,"Kim");

        // 외부클래스에서 접근을 해도 가능하게끔 Customer()에서 메소드를 생성했음
        customerKim.setBonusPoint(1000);
     //   System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
    }
}
