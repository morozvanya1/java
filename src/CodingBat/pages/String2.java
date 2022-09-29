package CodingBat.pages;

import java.util.ArrayList;

public class String2 {

    public String doubleChar(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.substring(i, i + 1)).append(str.substring(i, i + 1));
        }
        return newStr.toString();
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        boolean isDog = false;
        boolean isCat = false;
        int countDog = 0;
        int countCat = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+3).equals("cat")) {
                isCat = true;
                countDog++;
            }
            if (str.substring(i, i+3).equals("dog")) {
                isDog = true;
                countCat++;
            }
        }
        return isDog && isCat && (countCat == countDog) || countCat == 0 && countDog == 0;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")) {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length() && b.length() > 0) {
            String newA = a.substring(a.length()-b.length());
            if (newA.equals(b)) {
                return true;
            }
        } else if (a.length() > 0) {
            String newB = b.substring(b.length()-a.length());
            if (newB.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public boolean xyzThere(String str) {
        for (int i = str.length()-1; i > 1; i--) {
            String newStr = str.substring(i-2,i+1);
            if (newStr.equals("xyz")) {
                return i - 2 == 0 || i - 2 > 0 && str.charAt(i - 3) != '.';
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                count++;
            }
            if (count > 0 && str.charAt(i) == 'y') {
                count = 0;
            }
        }
        return count == 0;
    }

    public String mixString(String a, String b) {
        String newStr = "";
        for (int i = 0; i < a.length() + b.length(); i++) {
            if (i < a.length()) {
                newStr += a.charAt(i);
            }
            if (i < b.length()) {
                newStr += b.charAt(i);
            }
        }
        return newStr;
    }

    public String repeatEnd(String str, int n) {
        String newStr = "";
        if (n <= str.length()) {
            for (int i = 0; i < n; i++) {
                newStr += str.substring(str.length() - n);
            }
        }
        return newStr;
    }

    public String repeatFront(String str, int n) {
        String newStr = "";
        if (n <= str.length()) {
            for (int i = 0; i < n; i++) {
                newStr += str.substring(0, n - i);
            }
        }
        return newStr;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String newStr = "";
        if (count < 0) {
            return "";
        } else if (count == 1) {
            return word;
        } else {
            for (int i = 0; i < count; i++) {
                newStr += word;
                if (i < count - 1) {
                    newStr += sep;
                }
            }
        }
        return newStr;
    }

    public boolean prefixAgain(String str, int n) {
        for (int i = n; i <= str.length()-n; i++) {
            if (str.substring(0,n).equals(str.substring(i,i+n))) {
                return true;
            }
        }
        return false;
    }

    public boolean xyzMiddle(String str) {
        int middleCount = str.length() / 2;
        if (str.length() > 2) {
            String firstMiddle = str.substring(middleCount-1, middleCount+2);
            return firstMiddle.equals("xyz") || str.length() % 2 == 0 && str.substring(middleCount - 2, middleCount + 1).equals("xyz");
        }
        return false;
    }

    public String getSandwich(String str) {
        int k = 0;
        for (int i = 0; i < str.length()-4; i++) {
            String bread = str.substring(i, i+5);
            if (bread.equals("bread")) {
                k = i+5;
                for (int j = str.length(); j > k; j--) {
                    bread = str.substring(j-5, j);
                    if (bread.equals("bread")) {
                        return str.substring(k, j-5);
                    }
                }
            }
        }
        return "";
    }

    public boolean sameStarChar(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && i > 0 && i < str.length() - 1) {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    result = false;
                }
            }
        }
        return result;
    }

    public String oneTwo(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i += 3) {
            if (i + 3 <= str.length()) {
                newStr += str.substring(i + 1, i + 3) + str.charAt(i);
            }
        }
        return newStr;
    }

    public String zipZap(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
                newStr += str.substring(i, i+1) + str.substring(i+2, i+3);
                i+=2;
            } else {
                newStr += str.substring(i, i+1);
            }
        }
        return newStr;
    }

    public String starOut(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && str.length() == 1) {
                return "";
            } else if (i == 0 && str.charAt(i) == '*') {
                str = str.substring(i + 2);
            } else if (i == str.length() - 1 && str.charAt(i) == '*') {
                str = str.substring(0, i - 1);
            } else if (str.charAt(i) == '*' && str.charAt(i + 1) == '*') {
                str = str.substring(0, i) + str.substring(i + 1);
                i -= 2;
            } else if (str.charAt(i) == '*') {
                str = str.substring(0, i - 1) + str.substring(i + 2);
                i -= 2;
            }
        }
        return str;
    }

    public String plusOut(String str, String word) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                newStr += word;
                i += word.length() - 1;
            } else {
                newStr += "+";
            }
        }
        return newStr;
    }

    public String wordEnds(String str, String word) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) {
                    newStr += str.charAt(i - 1);
                }
                if (i + word.length() < str.length()) {
                    newStr += str.charAt(i + word.length());
                }
            }
        }
        return newStr;
    }

}
