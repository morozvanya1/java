import Warmup.SleepIn;

public class Main {

    public static void main(String[] args) {
        //Hello world
        System.out.println("Hello world");

        SleepIn s = new SleepIn();

        System.out.println(s.sleepIn(false, false));
        System.out.println(s.sleepIn(true, false));
        System.out.println(s.sleepIn(false, true));
    }
}