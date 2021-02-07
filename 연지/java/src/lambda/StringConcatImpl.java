package lambda;

public class StringConcatImpl implements StringConcat {

    @Override
    public void makeString(String s1, String s2) { //추상메서드 구현
        System.out.println( s1 + "," + s2);
    }
}
