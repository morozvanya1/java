package CodingBat.pages;

public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        int sumBig = big * 5;
        if (goal - sumBig - small <= 0) {
            if (goal % 5 <= small) {
                return true;
            }
        }
        return false;
    }

    public int loneSum(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        }
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        return n >= 13 && n <= 14 || n >= 17 && n <= 19 ? 0 : n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        if (num % 10 < 5) {
            return num - num % 10;
        }
        return num + (10 - num % 10);
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) <= 1) {
            if (Math.abs(c - a) > 1 && Math.abs(c - b) > 1) {
                return true;
            }
        } else if (Math.abs(c - a) <= 1) {
            if (Math.abs(b - a) > 1 && Math.abs(b - c) > 1) {
                return true;
            }
        }
        return false;
    }

    public int blackjack(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        return max > 21 ? min > 21 ? 0 : min : max;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(a, b);
        max = Math.max(max, c);
        int min = Math.min(a, b);
        min = Math.min(min, c);
        return Math.abs(a - max) == Math.abs(a - min) || Math.abs(b - max) == Math.abs(b - min) || Math.abs(c - max) == Math.abs(c - min);
    }

    public int makeChocolate(int small, int big, int goal) {
        int withoutBig = goal - big * 5;
        while (withoutBig < 0 && big >= 0) {
            big = big - 1;
            withoutBig = goal - big * 5;
        }
        if (withoutBig <= small) {
            return goal - big * 5;
        } else {
            return -1;
        }
    }

}
