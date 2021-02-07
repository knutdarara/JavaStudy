package inner_class;

class VendingMachine{
    int money=0;
    void vendingMachine_method(){
        System.out.println("자판기가 생성되었습니다.");
    }
}
class button{
    void btn_method(){
        System.out.println("버튼이 생성되었습니다.");
    }
}
class ex_1 extends VendingMachine{
    class ex_1_btn extends button{
    }
}

public class innerclass_Ex3_1 {
    public static void main(String[] args){
        ex_1 vm_test1 = new ex_1();
        vm_test1.vendingMachine_method();
        ex_1.ex_1_btn btn_test1 = vm_test1.new ex_1_btn();
        btn_test1.btn_method();
        System.out.println(vm_test1.money);
    }
}