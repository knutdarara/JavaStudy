package stack_pack;

public class stack_class {
    public static String[] array_push(String[] input_array,String input_str){
        // 배열안에 null의 인덱스 값을 위해 이용
        int cnt=0;
        // 배열안에 null이 존재하는지 확인
        for(int i=0; i < input_array.length; i++){
            if(input_array[i]==null){
                cnt += 1;
            }
        }
        // null이 없다면 배열 안이 꽉차있다는 것이므로 가장 앞에 있는 요소를 빼냄
        if(cnt == 0){
            System.out.println("===========================");
            System.out.println("빠져나온 값 : " + input_array[0]);
            System.out.println("===========================");
            input_array[0]=input_str;

        }else{
            // 널이 있다면 그 인덱스 값을 매개변수로 받은 문자열로 수정
            input_array[cnt-1] = input_str;
        }
        return input_array;
    }
    public static String[] array_pop(String[] input_array){
        // 인덱스 값을 위한 cnt생성
        int cnt = 0;
        // 배열의 요소 하나하나 확인하고 null값의 수와 위치를 확인
        for(int i = 0; i<input_array.length; i++){
            if(input_array[i] == null){
                cnt += 1;
            }
        }
        // cnt가 input_array의 길이와 같으면 널값이 없다는 의미.
        if(cnt == input_array.length){
            System.out.println("빼낼 값이 없어요 ㅠㅠ");
        // cnt가 input_array의 길이와 같다면 해당 인덱스 위치의 값을 수정
        }else{
            System.out.println("빠져 나온 값 : "+input_array[cnt]);
            input_array[cnt]=null;
        }
        return input_array;
    }
}
