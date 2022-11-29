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

    }

}
