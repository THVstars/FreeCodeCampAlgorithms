package com.carolinasanchez;

import java.util.Arrays;

public class LargestNumbersSubArrays {
    public static void main(String[] args) {
        System.out.println(largestOfFour(new int[][]{{4, 7, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1230, 857, 1}}));
    }

    public static String largestOfFour(int[][] arr) {
        int[][] largestNumber = new int[][]{{-100}, {-100}, {-100}, {-100}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largestNumber[i][0]) {
                    largestNumber[i][0] = arr[i][j];
                    // System.out.println(Arrays.deepToString(largestNumber));
                } // Java required me to add the 0 index in order to compare and assign the values between these two arrays. In JavaScript, you can just have largestNumber[i] and it works perfectly. The second index of largestNumber is always 0 since each sub-array only has one value inside it. Adding the 0 in JavaScript does not work for some reason.
            }
        } return Arrays.deepToString(largestNumber);
    }
}
