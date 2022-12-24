package CodingBat.pages;

public class Recursion1 {

    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n < 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies - 1);
        return 2 + bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }

    public int count7(int n) {
        if (n == 0) return 0;
        int count = 0;
        if (n % 10 == 7) {
            count++;
        }
        return count + count7(n / 10);
    }

    public int count8(int n) {
        if (n == 0) return 0;
        int count = 0;
        if (n % 100 == 88) count += 2;
        else if (n % 10 == 8) count += 1;
        return count + count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 0) return 0;
        if (n == 1) return base;
        return base * powerN(base , n - 1);
    }

    public int countX(String str) {
        if (str.length() == 0) return 0;
        int count = 0;
        if (str.charAt(str.length() - 1) == 'x') count++;
        return count + countX(str.substring(0, str.length() - 1));
    }

    public int countHi(String str) {
        if (str.length() < 2) return 0;
        int count = 0;
        if (str.substring(str.length() - 2).equals("hi")) count++;
        return count + countHi(str.substring(0, str.length() - 1));
    }

    public String changeXY(String str) {
        if (str.length() == 0) return "";
        String path = "";
        if (str.charAt(str.length() - 1) == 'x') path += "y";
        else path += str.charAt(str.length() - 1);
        return changeXY(str.substring(0, str.length() - 1)) + path;
    }

    public String changePi(String str) {
        if (str.length() < 1) return "";
        if (str.length() < 2) return str;
        String path = "";
        int count = 1;
        if (str.substring(str.length() - 2).equals("pi")) {
            path += "3.14";
            count = 2;
        } else path += str.charAt(str.length() - 1);
        return changePi(str.substring(0, str.length() - count)) + path;
    }

    public String noX(String str) {
        if (str.length() == 0) return "";
        String path = "";
        if (str.charAt(str.length() - 1) == 'x') path += "";
        else path += str.charAt(str.length() - 1);
        return noX(str.substring(0, str.length() - 1)) + path;
    }

    public boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;
        boolean result = false;
        if (nums[index] == 6) result = true;
        return result || array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        int count = 0;
        if (nums[index] == 11) count++;
        return count + array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if (index + 1 >= nums.length) return false;
        boolean result = false;
        if (nums[index] * 10 == nums[index + 1]) result = true;
        return result || array220(nums, index + 1);
    }

    public String allStar(String str) {
        if (str.length() < 1) return "";
        if (str.length() < 2) return str;
        String path = str.charAt(0) + "*";
        return path + allStar(str.substring(1));
    }

    public String pairStar(String str) {
        if (str.length() < 1) return "";
        if (str.length() < 2) return str;
        String path = str.charAt(0) == str.charAt(1) ? str.charAt(0) + "*" : String.valueOf(str.charAt(0));
        return path + pairStar(str.substring(1));
    }

    public String endX(String str) {
        if (str.length() < 1) return "";
        String path1 = "";
        String path2 = "";
        if (str.charAt(0) == 'x') {
            path2 = String.valueOf(str.charAt(0));
        } else {
            path1 = String.valueOf(str.charAt(0));
        }
        return path1 + endX(str.substring(1)) + path2;
    }

    public int countPairs(String str) {
        if (str.length() < 2) return 0;
        int count = 0;
        int interval = 0;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(0) == str.charAt(i)) {
                if (i - interval > 1) {
                    count++;
                    interval = i;
                } else {
                    count--;
                }
            }
        }
        if (count > 1) {
            count--;
        }
        return count + countPairs(str.substring(1));
    }

    public int countAbc(String str) {
        if (str.length() < 3) return 0;
        int count = 0;
        if (str.startsWith("abc") || str.startsWith("aba")) count++;
        return count + countAbc(str.substring(1));
    }

    public int count11(String str) {
        if (str.length() < 2) return 0;
        int count = 0;
        if (str.startsWith("11")) count++;
        return count + (count > 0 ? count11(str.substring(2)) : count11(str.substring(1)));
    }

    public String stringClean(String str) {
        if (str.length() < 1) return "";
        char path = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (path == str.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        return path + stringClean(str.substring(count));
    }

    public int countHi2(String str) {

    }

}
