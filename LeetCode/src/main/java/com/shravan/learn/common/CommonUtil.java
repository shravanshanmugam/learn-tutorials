package com.shravan.learn.common;

public class CommonUtil {
    public static int sudokuBoxNumber(int row, int column) {
        return (row / 3) * 3 + column / 3;
    }

    /**
     * Assuming a > b
     * T(a,b) = O(log(min(a,b)))
     */
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }

    public static int product(int[] nums) {
        int pdt = 1;
        for (int i = 0; i < nums.length; i++) {
            pdt *= nums[i];
        }
        return pdt;
    }

    public static int productExcludeSelf(int[] nums, int excludeIndex) {
        int pdt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i != excludeIndex)
                pdt *= nums[i];
        }
        return pdt;
    }

    public static int product(int[] nums, int left, int right) {
        int pdt = 1;
        for (int i = left; i <= right; i++) {
            pdt *= nums[i];
        }
        return pdt;
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
        }
        return sum;
    }
}
