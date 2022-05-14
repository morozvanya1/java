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

    public boolean parrotTrouble(boolean talking, int hour) {
        return (hour > 20 || hour < 7) && talking;
    }

    public boolean makes10(int a, int b) {
        return (a == 10) || (b == 10) || (a + b == 10);
    }

    public boolean nearHundred(int n) {
        return !(Math.abs(n - 100) > 10) || !(Math.abs(n - 200) > 10);
    }

}