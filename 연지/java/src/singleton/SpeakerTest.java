package singleton;

public class SpeakerTest {
    public static void main(String[] args) {
        SystemSpeaker ss1 = SystemSpeaker.getInstance();
        SystemSpeaker ss2 = SystemSpeaker.getInstance();

        System.out.println(ss1 == ss2);
        System.out.println(ss1.systemVol);
        System.out.println(ss2.systemVol);
    }
}
