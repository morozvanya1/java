package CodingBat;

public class Warmup2 {

    public String stringTimes(String str, int n) {
        String newStr = "";
        for (int i = 0; i < n; i++) {
            newStr += str;
        }
        return newStr;
        //return str.repeat(n);
    }

    public String frontTimes(String str, int n) {
        String newStr = "";
        for (int i = 0; i < n; i++) {
            if (str.length() > 3) {
                newStr += str.substring(0,3);
            } else {
                newStr += str;
            }
        }
        return newStr;
    }

}
