package inner_class;
// 내부 클래스를 사용했을 때
//class a_class {
//    int i=100;
//    b_class b= new b_class();
//    class b_class{
//        void method(){
//            System.out.println(i);
//            System.out.println("안쪽 클래스의 메소드");
//        }
//    }
//}

// 내부클래스를 사용하게되면 전에 일반적으로 접근하던 방식을 사용하지 못하게됨.
//class c_class{
//    b_class b= new b_class;
//}
// 이런식으로 접근하게됨.
//class c_class{
//    a_class te = new a_class();
//    a_class.b_class b= te.new b_class();
//}


//public class innerclass_Ex1_2 {
//    public static void main(String[] args){
//        a_class a_test = new a_class();
//        a_class.b_class b_test = a_test.new b_class();
//        b_test.method();
//    }
//}
