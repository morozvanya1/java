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

    }

}
