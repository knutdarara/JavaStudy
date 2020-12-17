package append_pack;

import java.util.Arrays;

public class append_test {
    public static void main(String[] args){
        String[] array_test = new String[2];
        System.out.println("------------수정 전-----------");
        System.out.println(Arrays.toString(array_test));
        array_test = append_class.app_str(array_test,"테스트1");
        array_test = append_class.app_str(array_test,"테스트2");
        System.out.println("--------------수정 후 --------------");
        System.out.println(Arrays.toString(array_test));
    }
}
