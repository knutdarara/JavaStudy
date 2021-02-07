package streamEx;


import java.util.ArrayList;
import java.util.List;

//  병렬처리
public class stream19 {
    private List<student2> list;

    public stream19() {
        list = new ArrayList<>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }

    public void accumulate(student2 student) {
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    public void combine(stream19 other) {
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }

    public List<student2> getList() {
        return list;
    }

}
