package CodingBat.pages;

public class String3 {

    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                if (i > 0 && (str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'z')) {
                    count++;
                }
            } else if (i == str.length() - 1) {
                if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                    count++;
                }
            }
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        String baseTmp;
        int endI = base.length() - remove.length() + 1;
        for (int i = 0; i < endI; ) {
            baseTmp = base.substring(i, i + remove.length()).toLowerCase();
            if (baseTmp.equals(remove.toLowerCase())) {
                base = base.substring(0,i) + base.substring(i + remove.length());
                endI = base.length() - remove.length() + 1;
                i = 0;
            } else i++;
        }
        return base;
    }

    public boolean equalIsNot(String str) {
        int countNot = 0;
        int countIs = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (i + 2 < str.length() && str.substring(i, i + 3).equals("not")) {
                countNot++;
            } else if (str.substring(i, i + 2).equals("is")) {
                countIs++;
            }
        }
        return countIs == countNot;
    }

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i == 0 && i != str.length() - 1 && str.charAt(i+1) != str.charAt(i)) {
                    return false;
                } else if (i > 0 && str.charAt(i-1) != str.charAt(i)) {
                    if (i == str.length() - 1 && str.charAt(i-1) != str.charAt(i)) {
                        return false;
                    } else if (str.charAt(i+1) != str.charAt(i) && str.charAt(i-1) != str.charAt(i)) {
                        return false;
                    }
                } else if (str.length() == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2)) {
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }

    public String sameEnds(String string) {
        int j = 0;
        String s1 = "";
        String s2 = "";
        for (int i = string.length() / 2; i > 0; i--) {
            s1 = string.substring(0, string.length() / 2 - j);
            s2 = string.length() % 2 != 0 ? string.substring(string.length() / 2 + j + 1) : string.substring(string.length() / 2 + j);
            if (s1.equals(s2)) {
                return s1;
            }
            j++;
        }
        return "";
    }

    public String mirrorEnds(String string) {
        char s1;
        char s2;
        for (int i = 0; i < string.length(); i++) {
            s1 = string.charAt(i);
            s2 = string.charAt(string.length() - 1 - i);
            if (i == string.length() / 2) {
                return string;
            } else if (s1 != s2) {
                return string.substring(0, i);
            }
        }
        return "";
    }

    public int maxBlock(String str) {
        int count = 1;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            maxCount = Math.max(maxCount, count);
            count = 1;
        }
        return maxCount;
    }

    public int sumNumbers(String str) {
        String tmpSum = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                tmpSum += str.substring(i, i+1);
            } else if (!tmpSum.equals("")) {
                sum += Integer.parseInt(tmpSum);
                tmpSum = "";
            }
            if (i == str.length() - 1 && !tmpSum.equals("")) {
                sum += Integer.parseInt(tmpSum);
            }
        }
        return sum;
    }

    public String notReplace(String str) {
        String subStr;
        for (int i = 0; i < str.length() - 1; i++) {
            subStr = str.substring(i, i + 2);
            if (subStr.equals("is")) {
                if (str.length() == 2) {
                    str = str.substring(0, i + 2) + " not" + str.substring(i + 2);
                    break;
                }
                if (i == 0 && !Character.isLetter(str.charAt(i + 2))) {
                    str = str.substring(0, i + 2) + " not" + str.substring(i + 2);
                } else if (i + 2 == str.length() && !Character.isLetter(str.charAt(i - 1))) {
                    str = str.substring(0, i + 2) + " not" + str.substring(i + 2);
                } else if (i > 0 && !Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))) {
                    str = str.substring(0, i + 2) + " not" + str.substring(i + 2);
                }
            }
        }
        return str;
    }

}
