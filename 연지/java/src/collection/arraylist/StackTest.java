package collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data) {
        arrayStack.add(data); //맨 뒤에 요소 추가
    }

    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayStack.remove(len - 1)); //맨 뒤에있는 자료 반환하고 제거
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A"); //A
        stack.push("B"); //A B
        stack.push("C"); //A B C

        System.out.println(stack.pop()); //pop:C , A B
        System.out.println(stack.pop()); //pop:B
        System.out.println(stack.pop()); //pop:A
    }
}
