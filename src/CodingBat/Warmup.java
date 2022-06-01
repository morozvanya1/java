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

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0) && (b < 0);
        }
        return (a < 0 && !(b < 0)) || (!(a < 0) && b < 0);
    }

    public String notString(String str) {
        return (str.length() > 2) && str.substring(0,3).equals("not") ? str : "not " + str;
    }

    public String missingChar(String str, int n) {
        if (str.length() >= n) {
            if (n == 0) {
                return str.substring(n+1);
            }
            return str.substring(0,n) + str.substring(n+1);
        }
        return str;
    }

    public String frontBack(String str) {
        int lastCharStr = str.length()-1;
        return str.length() > 1 ? str.substring(lastCharStr) + str.substring(1,lastCharStr) + str.charAt(0) : str;
    }

    public String front3(String str) {
        String tripleStr = str + str + str;
        if (str.length() > 2) {
            String subTripleStr = str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
            return subTripleStr;
        }
        return tripleStr;
    }

    public String backAround(String str) {
        if (str.length() > 0) {
            char lastStr = str.charAt(str.length()-1);
            str = lastStr + str + lastStr;
        }
        return str;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        if (str.length() == 1) {
            char lastStr = str.charAt(0);
            str = lastStr + str + lastStr;
        } else if (str.length() > 1) {
            String lastStr = str.substring(0,2);
            str = lastStr + str + lastStr;
        }
        return str;
    }

    public boolean startHi(String str) {
        return (str.length() > 1) && (str.substring(0,2).equals("hi"));
    }

    public boolean icyHot(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0;
    }

    public boolean in1020(int a, int b) {
        return a >= 10 && a <= 20 || b >= 10 && b <= 20;
    }

}