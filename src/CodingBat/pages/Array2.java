package CodingBat.pages;

public class Array2 {

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int maxV, minV;
        if (nums.length > 0) {
            maxV = minV = nums[0];
            for (int i = 0; i < nums.length; i++) {
                maxV = Math.max(maxV, nums[i]);
                minV = Math.min(minV, nums[i]);
            }
        } else {
            maxV = minV = 0;
        }
        return maxV - minV;
    }

    public int centeredAverage(int[] nums) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                int temp = 0;
                if (nums[i] > nums[i + 1]) {
                    isSorted = false;
                    temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        if (nums.length % 2 != 0) {
            return nums[nums.length/2];
        }
        return (nums[nums.length/2-1] + nums[nums.length/2]) / 2;
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                i++;
            };
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean check = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7 && check) {
                check = false;
            } else if (nums[i] == 6 || check) {
                check = true;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i-1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {

    }

}
