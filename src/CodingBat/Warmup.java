package CodingBat;

public class Warmup {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return !(aSmile ^ bSmile);
    }

    public int sumDouble(int a, int b) {
        return a == b ? (a + b) * 2 : (a + b);
    }

    public int diff21(int n) {
        return n > 21 ? (n - 21) * 2 : (21 - n);
    }

}