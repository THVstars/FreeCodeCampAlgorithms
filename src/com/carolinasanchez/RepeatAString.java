package com.carolinasanchez;

public class RepeatAString {
    public static void main(String[] args) {
        System.out.println(repeatStringNumTimes("Yeontan", 7));
    }
    public static String repeatStringNumTimes(String str, int num) {
        String newString = "";
        for (int i = 0; i < num; i++) {
            if (num > 0) {
                newString += str;
            } else {
                return "";
            }
        }
        return newString;
    }
}
/*
JavaScript:
function repeatStringNumTimes(str, num) {
  let newString = ""
  for (let i = 0; i < num; i++) {
    if (num > 0) {
      newString += str
    } else {
      return ""
    }
  }
  return newString;
}

repeatStringNumTimes("Yeontan", 7);
*/
