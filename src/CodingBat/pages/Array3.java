package CodingBat.pages;

public class Array3 {

    public int maxSpan(int[] nums) {
        int count = 1;
        int tmp = 0;
        int tempI = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            tmp = nums[i];
            for (j = i + 1; j < nums.length; j++) {
                if (tmp == nums[j]) {
                    tempI = j + 1;
                }
            }
            count = Math.max(count,tempI - i);
        }
        return nums.length == 0 ? 0 : count;
    }

    public int[] fix34(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        tmp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        int tmp = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        if ((j > 0 && nums[j - 1] != 4) || (j == 0 && nums[j] != 4)) {
                            tmp = nums[i + 1];
                            nums[i + 1] = nums[j];
                            nums[j] = tmp;
                            break;
                        }
                    }
                }
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int sumBeg = 0;
        int sumEnd;
        for (int i = 0; i < nums.length; i++) {
            sumBeg += nums[i];
            sumEnd = 0;
            for (int j = nums.length - 1; j > i; j--) {
                sumEnd += nums[j];
            }
            if (sumBeg == sumEnd) {
                return true;
            }
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int j = 0;
        for (int value : inner) {
            for (; j < outer.length; j++) {
                if (value == outer[j]) {
                    break;
                } else if (j == outer.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[] squareUp(int n) {
        int[] arr = new int[n*n];
        if (n == 1) {
            arr[0] = 1;
        } else {
            int inc = 1;
            int arrVal = 1;
            for (int j = 0; j < n; j++) {
                for (int i = inc * n - 1; i > 0; i--) {
                    arr[i] = arrVal;
                    inc--;
                    arrVal++;
                    if (inc == 0) {
                        break;
                    }
                }
                arrVal = 1;
                inc = j + 2;
            }
        }
        return arr;
    }

    public int[] seriesUp(int n) {

    }

}
