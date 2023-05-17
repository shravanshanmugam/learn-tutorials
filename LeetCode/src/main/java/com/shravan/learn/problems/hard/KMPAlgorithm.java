package com.shravan.learn.problems.hard;

import java.util.Arrays;

public class KMPAlgorithm {
    public static void main(String[] args) {
        int match1 = match("abc", "ab");
        System.out.println("match1 = " + match1);// 0
        int match11 = match("abc", "abc");
        System.out.println("match11 = " + match11);// 0
        int match12 = match("afabc", "abc");
        System.out.println("match12 = " + match12);// 2
        int match2 = match("afabfabcfabcdfabcdabfabcdababcag", "ababc");
        System.out.println("match2 = " + match2);// 25
        int match3 = match("afabfabcfabcdfabcdabfabcdababcag", "abcdababca");
        System.out.println("match3 = " + match3);// 21
    }

    public static int match(String text, String pattern) {
        int[] lps = computeLPSArray(pattern);
        System.out.println("lps = " + Arrays.toString(lps));
        return patternMatch(text, pattern, lps);
    }

    public static int patternMatch(String text, String pattern, int[] lps) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < text.length() && j >= 0 && j < pattern.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                if (j == pattern.length() - 1) {
                    return k;
                }
                i++;
                j++;
            } else {
                k++;
                if (j == 0) {
                    i = k;
                }
                j = lps[j];
            }
        }
        return -1;
    }

    public static int[] computeLPSArray(String pat) {
        int i = 0;
        int j = i + 1;
        int M = pat.length();
        int lps[] = new int[M];
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for j = 1 to M-1
        while (j < M) {
            if (pat.charAt(i) == pat.charAt(j)) {
                lps[j] = i + 1;
                j++;
                i++;
            } else {
                if (i != 0) {
                    i = lps[i - 1];
                } else // if (i == 0)
                {
                    lps[j] = i;
                    j++;
                }
            }
        }
        return lps;
    }
}
