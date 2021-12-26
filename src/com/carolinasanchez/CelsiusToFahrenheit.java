package com.carolinasanchez;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println(convertToF(30));
        System.out.println(convertToF(-30));
    }
    public static int convertToF(int celsius) {
        int fahrenheit = celsius*9/5+32;
        return fahrenheit;
    }
}
