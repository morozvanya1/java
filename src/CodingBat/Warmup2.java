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

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == 'x') {
                return str.substring(i, i + 2).equals("xx");
            }

        }
        return false;
    }

    public String stringBits(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i+=2) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public String stringSplosion(String str) {
        String newStr = "";
        for (int i = 0; i <= str.length(); i++) {
            newStr += str.substring(0,i);
        }
        return newStr;
    }

    public int last2(String str) {
        int count = 0;
        if (str.length() > 1) {
            String newStr = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i+2).equals(newStr)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < 4 && nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }
        return false;
    }

}
