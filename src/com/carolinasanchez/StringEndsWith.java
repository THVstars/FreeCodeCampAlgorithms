package com.carolinasanchez;

public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println(confirmEnding("Taehyung, please give me strength.", "strength."));
    }
    public static boolean confirmEnding(String str, String target) {
        boolean result = false;
        for (int i = 0; i < target.length(); i++) {
            //System.out.println(target.charAt(i));
            //System.out.println(str.charAt(str.length()-target.length()+i));
            if (str.charAt(str.length()-target.length()+i) == target.charAt(i)) {
                //System.out.println(result);
                result = true;
            } else {
                return false; // THIS MUST BE RETURN FALSE INSTEAD OF RESULT = FALSE, OR ELSE RESULT'S VALUE CAN BE UPDATED TO TRUE LATER IN THE LOOP.
            }
        } return result;
    }
}
/*
JavaScript:
function confirmEnding(str, target) {
  let result = false;
  for (let i = 0; i < target.length; i++) {
    //console.log(target[i])
    //console.log(str[str.length-target.length+i])
    console.log(str[str.length-target.length+i])
    if (str[str.length-target.length+i] == target[i]) {
      //console.log(result);
      result = true;
    } else {
      return false;
    }
  } return result;
}
confirmEnding("Taehyung, please give me strength.", "strength.");
*/