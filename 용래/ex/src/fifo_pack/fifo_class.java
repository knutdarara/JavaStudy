package fifo_pack;

public class fifo_class {
    // 함수선언 부분
    public static String[] fifo_list(String[] plus_array, String plus_str){
        // 작업할 새로운 배열생성(매개변수로받은 배열의 length만큼 배열 선언
        String[] return_list= new String[plus_array.length];
        // 가장 뒤에있는 요소를 프린트 시키고 앞에 있는 요소를 전부 인덱스1씩 증가 시켜 시프트시킴
        for(int i=0; i < plus_array.length;i++){
            if(i==(plus_array.length-1)){
                System.out.println("빠진 값"+plus_array[plus_array.length-1]);
            }else {
                return_list[i + 1] = plus_array[i];
            }
        }
        // 매개변수로 받은 문자열을 0번 인덱스에 저장
        return_list[0]=plus_str;
        return return_list;
    }
}
