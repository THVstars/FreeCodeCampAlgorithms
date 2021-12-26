package com.carolinasanchez;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
    public static String reverseString(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i > -1; i--) { // Can use i >= 0 or i > -1 here.
            str1 += str.charAt(i); // NOTE: This worked without using String.valueOf. WARNING: I kept forgetting to add += here! If it's not included, it won't print the entire string on one line and will instead print one letter per line.
        } return str1;
    }
}
