package fifo_pack;

import java.util.Arrays;

public class fifo_test {
    public static void main(String[] args){
        String[] fifo_array = new String[3];
        System.out.println("--------------수정 전--------------------");
        System.out.println(Arrays.toString(fifo_array));
        System.out.println("----------------------------------------");
        for(int i=0; i<5; i++){
            fifo_array = fifo_class.fifo_list(fifo_array,Integer.toString(i));
            System.out.println(Integer.toString(i)+"번째 "+Arrays.toString(fifo_array));
        }
        System.out.println("--------------수정 후--------------------");
        System.out.println(Arrays.toString(fifo_array));
        System.out.println("----------------------------------------");
    }
}
