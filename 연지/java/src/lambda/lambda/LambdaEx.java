package lambda;

interface Compare{
    public int compareTo(int a, int b);
}

public class LambdaEx {
    //(매개변수 목록)->{실행문}
    public static void exec(Compare com) {
        int a = 10;
        int b = 20;
        int value = com.compareTo(a,b);
        System.out.println(value);
    }
    public static void main(String[] args) {
        exec((i,j)->{
            return i + j;
        });
    }
}

class LambdaEx2 {
    @FunctionalInterface
    public interface MyNumber{
        int getMax(int num, int num2);
    }
    public static void main(String[] args) {
        MyNumber max = (x,y) -> (x>=y)? x:y;
        System.out.println(max.getMax(10,25));
    }
}

class RunnableEx {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 30; i++) {
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}


//Thread thread = new Thread( () -> {
//    for (int i = 0; i < 10; i++) {
//        System.out.println(i);
//    }
//});
