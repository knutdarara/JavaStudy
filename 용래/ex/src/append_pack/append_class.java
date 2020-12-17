package append_pack;

public class append_class {
    // append 클래스 선언
    public static String[] app_str(String[] input_list,String plus_str){
        // 매개변수로 받은 배열의 length보다 1을 증가시켜 리스트생성(요소를 추가할거기때문에)
        String[] return_list = new String[input_list.length+1];
        // 기존에 있던 배열 요소를 그대로 복사
        for(int i=0; i<input_list.length; i++){
            return_list[i]=input_list[i];
        }
        // 배열 끝에 매개변수로 받은 문자열을 추가
        return_list[input_list.length]=plus_str;
        return return_list;
    }
}
