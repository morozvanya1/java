package CodingBat;

public class String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String substring = str.substring(str.length() - 2);
        return substring + substring + substring;
    }

    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0,2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        return front ? str.substring(0,1) : str.substring(str.length() - 1);
    }

    public String withouEnd2(String str) {
        return str.length() < 2 ? "" : str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        return str.substring(str.length()/2 - 1, str.length()/2 + 1);
    }

    public boolean endsLy(String str) {
        return str.length() > 1 && str.substring(str.length() - 2).equals("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        return str.length() > index + 1 && index + 1 > 0 ? str.substring(index, index + 2) : str.substring(0, 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length()/2 - 1, str.length()/2 + 2);
    }

    public boolean hasBad(String str) {
        return (str.length() > 2 && str.substring(0,3).equals("bad")) || (str.length() > 3 && str.substring(1,4).equals("bad"));
    }

    public String atFirst(String str) {
        return str.length() > 1 ? str.substring(0, 2) : str.length() > 0 ? str.charAt(0) + "@" : "@@";
    }

    public String lastChars(String a, String b) {
        return a.length() > 0 && b.length() > 0 ? a.substring(0,1) + b.substring(b.length() - 1) :
                b.length() > 0 ? "@" + b.substring(b.length() - 1) :
                        a.length() > 0 ? a.substring(0,1) + "@" : "@@";
    }

    public String conCat(String a, String b) {
        return a.length() > 0 && b.length() > 0 && a.substring(a.length() - 1).equals(b.substring(0, 1)) ? a + b.substring(1) : a + b;
    }

    public String lastTwo(String str) {
        return str.length() > 1 ? str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1) : str;
    }

    public String seeColor(String str) {
        if (str.length() > 2 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        return str.length() > 3 && str.substring(0, 4).equals("blue") ? "blue" : "";
    }

    public boolean frontAgain(String str) {
        return str.length() > 1 && str.substring(0,2).equals(str.substring(str.length()-2));
    }

    public String minCat(String a, String b) {
        return a.length() > b.length() ? a.substring(a.length() - b.length()) + b : a + b.substring(b.length() - a.length());
    }

    public String extraFront(String str) {
        return str.length() > 1 ? str.substring(0,2) + str.substring(0,2) + str.substring(0,2) : str + str + str;
    }

    public String without2(String str) {
        return str.length() > 1 ? str.substring(0,2).equals(str.substring(str.length() - 2)) ? str.substring(2) : str : str;
    }

    public String deFront(String str) {
        String newStr = "";
        if (str.length() > 0 && str.charAt(0) == 'a') {
            newStr += "a";
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            newStr += "b";
        }
        return str.length() > 2 ? newStr + str.substring(2) : newStr;
    }

    public String startWord(String str, String word) {
            String newStr = "";
            if (str.length() > 0 && word.length() > 0) {
                newStr += str.charAt(0);
            }
            if (str.length() >= word.length()) {
                if (str.substring(1, word.length()).equals(word.substring(1))) {
                    newStr += word.substring(1);
                } else {
                    newStr = "";
                }
            } else {
                newStr = "";
            }
            return newStr;
    }

    public String withoutX(String str) {
        return str.length() > 1 && str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x' ? str.substring(1, str.length()-1) :
                str.length() > 1 && str.charAt(0) == 'x' && str.charAt(str.length()-1) != 'x' ? str.substring(1) :
                        str.length() > 1 && str.charAt(0) != 'x' && str.charAt(str.length()-1) == 'x' ? str.substring(0, str.length()-1) :
                                str.length() > 0 && str.charAt(0) == 'x' ? "" : str;
    }

    public String withoutX2(String str) {
        String newStr = "";
        if (str.length() > 0 && str.charAt(0) != 'x') {
            newStr += str.charAt(0);
        }
        if (str.length() > 1 && str.charAt(1) != 'x') {
            newStr += str.charAt(1);
        }
        return str.length() > 2 ? newStr + str.substring(2) : newStr;
    }

}
