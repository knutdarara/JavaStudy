package queue;

public class Main {

    public static Integer[] queue =new int[10];
    public static int queueSize=0;
    public static void  main(String[] args){

        for(int i=0; i<10; i++){
            Push(i);
        }
        for(int a: queue){
            System.out.println(a+"//");
        } //for each문 사용해서 훨씬 직관적
//        Push 부분
        System.out.println();
        for(int i=0; i<5; i++){
            System.out.println(" pop을 한 뒤 나온 값 = " + Pop() );
        }
        for(int i=0;queue[i] != null;i++){
            Integer a =null;
        }

    }
    public static void Push(int value){
        if(queueSize > 10){
            System.out.println("더이상 넣을 수 없습니다.");
        }else{
            queue[queueSize] = value;
            queueSize++;
        }
    }
    public static int Pop(){
        if(queueSize>=1){
            int result =queue[0];
            for(int i=0; i<queueSize-1;i++){
                queue[i] = queue[i+1];
            }
            queue[queueSize-1] = 0;
            return result;
        }else{
            int result = -1;
            System.out.println("queueSize가 0입니다. queueSize = " + queueSize);
            return result;
        }

    }
}
