package CodingBat.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AP1 {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i+1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            } else if ((i > 0 && scores[i - 1] == 100 && scores[i] == 100) ||  (scores[i] == 100 && scores[i + 1] == 100)) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (Math.abs(scores[i] - scores[i + 1]) <= 2 && Math.abs(scores[i] - scores[i + 2]) <= 2 ) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < scores.length / 2) {
                firstSum += scores[i];
            } else {
                secondSum += scores[i];
            }
        }
        return Math.max(firstSum, secondSum) / (scores.length / 2);
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] newWord = new String[n];
        for (int i = 0; i < n; i++) {
            newWord[i] = words[i];
        }
        return newWord;
    }

    public List wordsWithoutList(String[] words, int len) {
        List<String> Words = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                Words.add(words[i]);
            }
        }
        return Words;
    }

    public boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        int num;
        int ni = n;
        while (ni > 0) {
            num = ni % 10;
            if (num == 0 || n % num != 0) {
                return false;
            }
            ni /= 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] newNums = new int[count];
        count = 0;
        for (int num : nums) {
            if (num % 2 == 0 && count != newNums.length) {
                newNums[count] = num;
                count++;
            }
        }
        return newNums;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] newNums = new int[count];
        count = 0;
        for (int num : nums) {
            if (((num >= 0 && num <= 10) || (num >= 90 && num <= 100)) && count != newNums.length) {
                newNums[count] = num;
                count++;
            }
        }
        return newNums;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int count = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].length() != 0 && answers[i].length() != 0 && (key[i].substring(0, 1).equals("?") || answers[i].substring(0, 1).equals("?"))) {
                continue;
            } else if (key[i].equals(answers[i])) {
                count += 4;
            } else {
                count--;
            }
        }
        return count;
    }

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                count++;
            }
        }
        String[] newWords = new String[count];
        count = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                newWords[count] = word;
                count++;
            }
        }
        return newWords;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return scoresSpecial(a) + scoresSpecial(b);
    }

    public int scoresSpecial(int[] mass) {
        int maxEl = 0;
        for (int value : mass) {
            if (value % 10 == 0) {
                maxEl = Math.max(maxEl, value);
            }
        }
        return maxEl;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (heights[i] - heights[i + 1] < 0) {
                sum += Math.abs(heights[i] - heights[i + 1]) * 2;
            } else {
                sum += Math.abs(heights[i] - heights[i + 1]);
            }
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) <= 0) {
            if (aId - bId < 0) {
                return -1;
            } else if (aId - bId > 0) {
                return 1;
            }
        } else if (aName.compareTo(bName) > 0) {
            if (aId - bId > 0) {
                return -1;
            } else if (aId - bId < 0) {
                return 1;
            }
        }
        return 0;
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        int length = a.length + b.length;
        String[] mass = new String[length];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (i < a.length) {
                mass[i] = a[i];
            } else {
                mass[i] = b[j];
                j++;
            }
        }
        j = 0;

        String[] newMass = new String[n];
        Arrays.sort(mass);
        for (int i = 0; i < mass.length; i++) {
            if (n != 0) {
                if (i == 0) {
                    newMass[j] = mass[i];
                    j++;
                    n--;
                } else if (!newMass[j - 1].equals(mass[i])) {
                    newMass[j] = mass[i];
                    j++;
                    n--;
                }
            }
        }
        return newMass;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int j = 0;
        String temp = "";
        for (String ai : a) {
            for (; j < b.length; j++) {
                if (ai.compareTo(b[j]) == 0 && !ai.equals(temp)) {
                    count++;
                    temp = ai;
                } else if (ai.compareTo(b[j]) < 0) {
                    break;
                }
            }
        }
        return count;
    }

}