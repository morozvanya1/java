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

}
