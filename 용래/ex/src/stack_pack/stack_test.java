package stack_pack;

import java.util.Arrays;

public class stack_test {
    public static void main(String[] args){
        String[] test_ = new String[4];
        System.out.println("수정 전 배열 : "+ Arrays.toString(test_));
        for(int i=0; i<5; i++){
            stack_class.array_push(test_,Integer.toString(i)+"번 인덱스");
            System.out.println(Integer.toString(i)+ "번째 " + Arrays.toString(test_));
        }
        System.out.println("===================================");
        System.out.println("===========여기부터는 pop============");
        for(int i=0; i<5; i++) {
            stack_class.array_pop(test_);
            System.out.println(Arrays.toString(test_));
        }
    }
}
