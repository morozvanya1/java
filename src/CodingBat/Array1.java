package CodingBat;

import java.util.Arrays;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a.length > 0 && (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        int lastEl = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = lastEl;
        return nums;
    }

    public int[] reverse3(int[] nums) {
        int[] mass = nums.clone();
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = mass[j];
            j++;
        }
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0],nums[nums.length-1]);
        Arrays.fill(nums, max);
        return nums;
    }

    public int sum2(int[] nums) {
        return nums.length > 1 ? nums[0] + nums[1] : nums.length > 0 ? nums[0] : 0;
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] mid = {a[1], b[1]};
        return mid;
    }

    public int[] makeEnds(int[] nums) {
        return new int[] {nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] mass = new int[nums.length*2];
        mass[mass.length-1] = nums[nums.length-1];
        return mass;
    }

    public boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        for (int num : nums) {
            if (num == 2) {
                count2++;
            } else if (num == 3) {
                count3++;
            }
        }
        return count2 == 2 || count3 == 2;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1] == 3) {
                nums[i+1] = 0;
            }
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int summA = 0, summB = 0;
        for (int ai : a) {
            summA += ai;
        }
        for (int bi : b) {
            summB += bi;
        }
        return summA == summB ? a : summA > summB ? a : b;
    }

    public int[] makeMiddle(int[] nums) {
        int[] mass = new int[2];
        mass[0] = nums[nums.length/2-1];
        mass[1] = nums[nums.length/2];
        return mass;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] mass = new int[a.length + b.length];
        for (int i = 0; i < mass.length; i++) {
            if (i < a.length) {
                mass[i] = a[i];
            } else {
                mass[i] = b[i - a.length];
            }
        }
        return mass;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int[] mass = new int[3];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = nums[nums.length/2 - 1 + i];
        }
        return mass;
    }

    public int maxTriple(int[] nums) {
        int maxValue = Math.max(nums[0], nums[nums.length-1]);
        maxValue = Math.max(maxValue, nums[nums.length/2]);
        return maxValue;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length > 1) {
            int[] mass = new int[2];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = nums[i];
            }
            return mass;
        }
        return nums;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length > 1) {
            if (nums[0] == 1 && nums[1] == 3 || nums[nums.length-2] == 1 && nums[nums.length-1] == 3) {
                return true;
            } else if (nums.length > 2) {
                return nums[1] == 1 && nums[2] == 3;
            }
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] mass = new int[2];
        if (a.length > 1) {
            return mass = Arrays.copyOfRange(a, 0, 2);
        } else if (a.length > 0) {
            mass[0] = a[0];
            mass[1] = b[0];
            return mass;
        } else {
            return mass = Arrays.copyOfRange(b, 0, 2);
        }
    }

    public int[] front11(int[] a, int[] b) {
        int[] mass = new int[1];
        if (a.length > 0 && b.length > 0) {
            mass = new int[2];
            mass[0] = a[0];
            mass[1] = b[0];
            return mass;
        } else if (a.length > 0) {
            mass[0] = a[0];
            return mass;
        } else if (b.length > 0) {
            mass[0] = b[0];
            return mass;
        } else {
            return new int[0];
        }
    }

}
