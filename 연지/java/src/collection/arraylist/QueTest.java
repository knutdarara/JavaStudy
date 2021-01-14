package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<String>( );

    public void enQueue(String data) {
        arrayQueue.add(data); //맨 뒤에 요소 추가
    }
    public String deQueue() {
        int len = arrayQueue.size();
        if(len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }
        return(arrayQueue.remove(0)); //맨 앞 반환, 제거
    }
}
public class QueTest {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        queue.enQueue("A"); //A
        queue.enQueue("B"); //A B
        queue.enQueue("C"); //A B C

        System.out.println(queue.deQueue()); //pop:A , B C
        System.out.println(queue.deQueue()); //pop:B , C
        System.out.println(queue.deQueue()); //pop:C
    }
}
