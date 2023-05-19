package com.shravan.learn.problems.medium.trees;

import java.math.BigInteger;
import java.util.Arrays;

public class UniqueBST {
    /**
     * C0 = 1
     * Cn = Summation of Ci * Cn-i-1
     * or
     * Cn+1 = Summation of Ci * Cn
     */
    public int catalan(int n) {
        if (n <= 1) return 1;
        int catalan = 0;
        for (int i = 0; i < n; i++) {
            catalan += catalan(i) * catalan(n - i - 1);
        }
        return catalan;
    }

    /**
     * c0 = 1
     * c1 = c0c0
     * c2 = c0c1 + c1c0
     * c3 = c0c2 + c1c1 + c2c0
     * c4 = c0c3 + c1c2 + c2c1 + c3c0
     * c5 = c0c4 + c1c3 + c2c3 + c3c1 + c4c0
     */
    public int[] catalanDP(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp;
    }

    /**
     * Cn = 1/(n+1) * 2n Choose n
     * Cn = 1/(n+1) * 2n!/n!*n! = 2n!/(n+1)! * n!
     */
    public int catalanFactorial(int n) {
        int m = 2 * n + 1;
        BigInteger[] dp = new BigInteger[m+1];
        factorial(m, dp);
        BigInteger denominator = dp[n + 1].multiply(dp[n]);
        BigInteger numerator = dp[2 * n];
        return numerator.divide(denominator).intValue();
    }

    public BigInteger factorial(int n, BigInteger[] dp) {
        dp[0] = new BigInteger("1", 10);
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i-1].multiply(BigInteger.valueOf(i));
        }
        System.out.println("factorial = " + Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        UniqueBST uniqueBST = new UniqueBST();
        int n = 19;
        System.out.print("catalan = ");
        for (int i = 0; i <= n; i++) {
            int catalan = uniqueBST.catalan(i);
            System.out.print(catalan + " ");
        }
        System.out.println();
        int[] catalanDP = uniqueBST.catalanDP(n);
        System.out.println("catalanDP = " + Arrays.toString(catalanDP));
        double catalanFactorial = uniqueBST.catalanFactorial(n);
        System.out.println("catalanFactorial = " + catalanFactorial);
    }
}
