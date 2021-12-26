package com.carolinasanchez;

public class ReturnLongestWord {
    public static void main(String[] args) {
        System.out.println(findLongestWordLength("Taehyung please give me courage."));
    }
    public static Integer  findLongestWordLength(String str) {
        String[] strSplit = str.split(" ", 0);
        int longestWord = 0;

        for (int i = 0; i < strSplit.length; i++) {
            if (strSplit[i].length() > longestWord) {
                longestWord = strSplit[i].length();
            }
        } return longestWord;
    }
    // Split the string at the spaces. Then, within a for loop, if the length of the next word within strSplit is longer than the number within longestWord, then the length of that word becomes longestWord. My own ideas: Split, for loop, if statement. Others ideas: int variable to store the length of the longest word.
}
