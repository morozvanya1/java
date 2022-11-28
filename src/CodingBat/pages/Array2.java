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
        for (int num : nums) {
            if (num == 1) {
                return false;
            } else if (num == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += num;
            }
        }
        return sum == 8;
    }

    public boolean more14(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else if (num == 4) {
                count--;
            }
        }
        return count > 0;
    }

    public int[] fizzArray(int n) {
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] newArray = new String[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = String.valueOf(i);
        }
        return newArray;
    }

    public boolean no14(int[] nums) {
        boolean isOne = false, isFour = false;
        for (int num : nums) {
            if (num == 1) {
                isOne = true;
            } else if (num == 4) {
                isFour = true;
            }
        }
        return !(isOne && isFour);
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean isDoubleTwo = false, isDoubleFour = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                isDoubleTwo = true;
            } else if (nums[i] == 4 && nums[i + 1] == 4) {
                isDoubleFour = true;
            }
        }
        return isDoubleTwo ^ isDoubleFour;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 7) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7) {
                newArr[j] = i;
                j++;
            }
        }
        for (int i = 0; i < newArr.length - 1; i++) {
            if (Math.abs(newArr[i] - newArr[i+1]) < 3) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean isOne = false, isTwo = false;
        for (int num : nums) {
            if (num == 1) {
                isOne = true;
            } else if (num == 2 && isOne) {
                isTwo = true;
                isOne = false;
            }
        }
        return isTwo;
    }

    public boolean modThree(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i-1] % 2 == 0 && nums[i] % 2 == 0 && nums[i+1] % 2 == 0) {
                return true;
            } else if (nums[i-1] % 2 != 0 && nums[i] % 2 != 0 && nums[i+1] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean isAppear = false;
        for (int num : nums) {
            if (num == 3) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                newArr[j] = i;
                j++;
            }
        }
        for (int i = 0; i < newArr.length - 1; i++) {
            if (newArr[i] + 1 != newArr[i+1]) {
                isAppear = true;
            } else {
                return false;
            }
        }
        return isAppear && count == 3;
    }

    public boolean twoTwo(int[] nums) {
        boolean isAppearTwoTwo = true;
        int count = 0;
        for (int num : nums) {
            if (num == 2) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                newArr[j] = i;
                j++;
            }
        }
        for (int i = 0; i < newArr.length - 1; i++) {
            if (newArr[i] + 1 != newArr[i+1]) {
                isAppearTwoTwo = false;
            }
        }
        return isAppearTwoTwo && count != 1;
    }

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 1 == nums[i+1] && nums[i+1] + 1 == nums[i+2]) {
                return true;
            }
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] newArray = new int[end - start];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = start + i;
        }
        return newArray;
    }

    public int[] shiftLeft(int[] nums) {
        int tmp = nums.length > 0 ? nums[0] : 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
            if (i == nums.length - 2) {
                nums[i + 1] = tmp;
            }
        }
        return nums;
    }

    public int[] tenRun(int[] nums) {
        int tmp = 0;
        boolean isModTen = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                tmp = nums[i];
                isModTen = true;
            }
            if (isModTen) {
                nums[i] = tmp;
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                count = i;
                break;
            }
        }
        int[] newArray = new int[count];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }

    public int[] post4(int[] nums) {
        int count = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == 4) {
                break;
            }
            count++;
        }
        int[] newArray = new int[count];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = nums[nums.length - count + i];
        }
        return newArray;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && (nums[i-1] != nums[i] && nums[i+1] != nums[i])) {
                nums[i] = Math.max(nums[i-1], nums[i]);
                nums[i] = Math.max(nums[i+1], nums[i]);
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                int temp = 0;
                if (Math.abs(nums[i]) > Math.abs(nums[i + 1])) {
                    isSorted = false;
                    temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    public int[] withoutTen(int[] nums) {
        int [] numsWithoutTen = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                numsWithoutTen[j] = nums[i];
                j++;
            }
        }
        return numsWithoutTen;
    }

    public int[] zeroMax(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) {
                        tmp = Math.max(tmp, nums[j]);
                    }
                }
                nums[i] = tmp;
                tmp = 0;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int countOdd = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                countOdd++;
            }
        }
        int[] newArr = new int[nums.length];
        int j = 0;
        int k = countOdd;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                newArr[j] = nums[i];
                j++;
            } else {
                newArr[k] = nums[i];
                k++;
            }
        }
        return newArr;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] strArr = new String[end - start];
        for (int i = 0; i < strArr.length; i++) {
            if ((start + i) % 5 == 0 && (start + i) % 3 == 0) {
                strArr[i] = "FizzBuzz";
            } else if ((start + i) % 3 == 0) {
                strArr[i] = "Fizz";
            } else if ((start + i) % 5 == 0) {
                strArr[i] = "Buzz";
            } else {
                strArr[i] = String.valueOf(start + i);
            }
        }
        return strArr;
    }

}
