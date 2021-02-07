package inner_class;
//기존에 내부클래스를 하지 않고 사용했을 때
//
//class a_class {
//    int i=100;
//    b_class b= new b_class();
//}
//
//class b_class {
//    void method() {
//        a_class a = new a_class();
//        System.out.println(a.i);
//    }
//}
//// 이렇게 b클래스 안에서 a클래스를 선언을 해줘야함.
//// 이렇게 하게되면 다른 클래스에서 접근이 가능해지고 코드가 길어짐
//
//class c_class {
//    b_class b= new b_class();
//}
//// 지금은 이렇게 c에서 b를 접근이 가능하다. 하지만 내부클래스로 바뀌게되면 접근이 가능하긴하지만 지금과같은 방법으로 접근이 불가함.
//
//public class innerclass_Ex1_1 {
//    public static void main(String[] args){
//        b_class b = new b_class();
//        b.method();
//    }
//}