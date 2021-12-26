package com.carolinasanchez;

public class FactorializeNumbers {
    public static void main(String[] args) {
        System.out.println(factorialize(7));
    }
    public static int factorialize(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } // This if statement MUST be before the for-loop.
        for (int i = num-1; i > 0; i--) {
            num = num*i;
            // System.out.println(num); // TEST. The * 1 makes the last number appear twice. However, i MUST be > 0 instead of > -1 to attain a return for num = 2.
        } return num;
    } // PSEUDO CODE: I want to subtract one from num and multiply it by num, make num be equal to one less, and then repeat that operation. CONCLUSION: NOT actually what I did. This was accomplished by setting i to the value of num-1 and then decrementing i down to the number 1. Then, num was assigned the value of num*i within the for-loop, which keeps multiplying num by i until i reaches a value of 1.
}
