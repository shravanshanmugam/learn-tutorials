package com.shravan.learn.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringUtil {

    public static int charToInt(char a) {
        return Character.digit(a, 10);
//         alternatively ASCII conversion
//         return a-'0';
    }

    public static char intToChar(int a) {
        return Character.forDigit(a, 10);
//         alternatively ASCII conversion
//         return (char) (a+'0');
    }

    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] lowerCaseFrequency(String word) {
        int[] frequency = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            frequency[ch - 'a']++;
        }
        return frequency;
    }

    public static Map<Character, Integer> characterFrequency(String word) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        return frequency;
    }

    public static boolean isVowel(char c) {
        switch(c) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                return true;
            default: return false;
        }
    }

    public static void swap(char[] array, int i, int j) {
        char t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static List<String> words(char[] array) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(array[i]);
            }
        }
        if (sb.length() > 0) {
            words.add(sb.toString());
        }
        return words;
    }
}
