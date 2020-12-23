package interfaceEx;

public class StructureTest {
    public static void main(String[] arg) {
        Queue queue = new Queue();
        Stack stack = new Stack();

        Stack stack2 = new Stack();

        queue.Push("하");
        queue.Push(1);
        queue.Push(1.11);
        System.out.println("queue 에 저장 된 값 " + queue.getObjectList());
        queue.Pop();
        System.out.println("queue 에 저장 된 값 " + queue.getObjectList());
        stack.Push(1);
        stack.Push("하");
        stack.Push(1.11);
        System.out.println("stack 에 저장 된 값 " + stack.getObjectList());
        stack.Pop();
        System.out.println("stack 에 저장 된 값 " + stack.getObjectList());

    }
}
