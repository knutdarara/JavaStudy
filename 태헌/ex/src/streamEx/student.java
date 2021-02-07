package streamEx;
import java.lang.Comparable;

public class student {
    private String name;
    private int score;

//    private int age;


    public student(String name, int score) {
        this.name = name;
        this.score = score;
//        this.age=age;
    }

    public String getName() {
        return name;
    }
    public int getScore() { return score; }
//    public int getAge() {
//        return age;
//    }


    public int compareTo(student ostudent) {
        return Integer.compare(score, ostudent.score);
    }

}

