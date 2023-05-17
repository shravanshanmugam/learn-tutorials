package com.shravan.learn.problems.medium.array;

import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        SetMatrixZeroes solution = new SetMatrixZeroes();
        int[][] matrix = {
                new int[]{0, 1, 2, 0},
                new int[]{3, 4, 5, 2},
                new int[]{1, 3, 1, 5}
        };
        solution.setZeroes(matrix);
        System.out.println("***SOLUTION***");
        print(matrix);
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println("row = " + Arrays.toString(row));
        }
    }

    private static void printArray(int[][] matrix) {
        System.out.println("[");
        for (int[] row : matrix) {
            System.out.println(" " + Arrays.toString(row));
        }
        System.out.println("]");
    }

    private static void printArray(int[][] matrix, String text1, String text2) {
        System.out.println("  " + Arrays.toString(text2.toCharArray()));
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            if (i == matrix.length-1) {
                System.out.println("  " + Arrays.toString(row));
            } else {
                System.out.println(text1.charAt(i) + " " + Arrays.toString(row));
            }
        }
    }

    private static void print(List<List<Integer>> triangle) {
        System.out.println("[");
        for (List<Integer> integers : triangle) {
            System.out.println(" " + integers);
        }
        System.out.println("]");
    }

    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // check if first row can be set to zero
        boolean firstRow = false;
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }
        // set zero in first row and first column as flag
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // based on flag set entire row/column to zero
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        // if (0,0) is 0 then first column can be set to zero
        if (matrix[0][0] == 0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
        // set entire first row to zero based on the flag
        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
