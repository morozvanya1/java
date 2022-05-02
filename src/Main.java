import CodingBat.Warmup;

public class Main {

    public static void main(String[] args) {
        //Hello world
        System.out.println("Hello world");

        Warmup w = new Warmup();

//        System.out.println(w.sleepIn(false, false));
//        System.out.println(w.sleepIn(true, false));
//        System.out.println(w.sleepIn(false, true));

        System.out.println(w.monkeyTrouble(true, true));
        System.out.println(w.monkeyTrouble(false, false));
        System.out.println(w.monkeyTrouble(true, false));

    }
}