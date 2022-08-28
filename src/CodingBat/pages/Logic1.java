package CodingBat.pages;

public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend && cigars >= 40) || (cigars >= 40 && cigars <= 60);
    }

    public int dateFashion(int you, int date) {
        return you <= 2 || date <= 2 ? 0 : you > 7 || date > 7 ? 2 : 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return !(temp < 60 || temp > 100);
        } else {
            return !(temp < 60 || temp > 90);
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        return (speed <= 60) ? 0 : (speed <= 80) ? 1 : 2;
    }

    public int sortaSum(int a, int b) {
        return !((a + b) < 10 || (a + b) > 20) ? 20 : a + b;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation && (day == 6 || day == 0)) {
            return "off";
        } else if (!vacation && (day > 0 && day < 6)) {
            return "7:00";
        }
        return "10:00";
    }

    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || Math.abs(a-b) == 6 || (a+b) == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode && (n <= 1 || n >= 10)) {
            return true;
        } else return !outsideMode && !(n <= 0 || n > 10);
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        return n % 5 == 0 ^ n % 3 == 0;
    }

    public boolean less20(int n) {
        return n % 20 == (20 - 1) || n % 20 == (20 - 2);
    }

    public boolean nearTen(int num) {
        return num % 10 >= (10 - 2) || num % 10 <= 2;
    }

    public int teenSum(int a, int b) {
        return (a > 10 && a % 10 >= 3 || b > 10 && b % 10 >= 3) ? 19 : a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (isMom || !isMorning);
    }

    public int teaParty(int tea, int candy) {
        return tea >= 5 && candy >= 5 ? tea / 2 >= candy || candy / 2 >= tea ? 2 : 1 : 0;
    }

    public String fizzString(String str) {
        return str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b' ?
                "FizzBuzz" : str.charAt(0) == 'f' ?
                "Fizz" : str.charAt(str.length() - 1) == 'b' ?
                "Buzz" : str;
    }

    public String fizzString2(int n) {
        return n % 15 == 0 ?
                "FizzBuzz!" : n % 3 == 0 ?
                "Fizz!" : n % 5 == 0 ?
                "Buzz!" : n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b) == c || (b + c) == a || (a + c) == b;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (a < b || bOk) && b < c;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        }
        return a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public boolean lessBy10(int a, int b, int c) {
        return a - 10 >= b || c - 10 >= a || c - 10 >= b || b - 10 >= c;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                die1 = 1;
                return die1 + die2;
            }
            return die1 + die2 + 1;
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        return a == b ? 0 : a % 5 == b % 5 ? Math.min(a, b) : Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {
        return a == 2 && b == 2 && c == 2 ? 10 : a == b && b == c ? 5 : b != a && c != a ? 1 : 0;
    }

    public int greenTicket(int a, int b, int c) {
        return a == b && b == c ? 20 : a == b || b == c || a == c ? 10 : 0;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        return ab == 10 || ac == 10 || bc == 10 ? 10 : ab - 10 == bc || ab - 10 == ac ? 5 : 0;
    }

    public boolean shareDigit(int a, int b) {
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10;
    }

    public int sumLimit(int a, int b) {
        int sumLength = String.valueOf(a + b).length();
        int aLength = String.valueOf(a).length();
        return sumLength == aLength ? a + b : a;
    }

}
