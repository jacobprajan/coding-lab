package com.dev.jac;

public class StringToInteger {

    public int myAtoi(String s) {

        String result = "";
        int operatorCount = 0;

        for(int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            char character = s.charAt(i);
            int ascii = (int) character;

            // ascii for space is 32
            // ascii 46 .
            // ascii 45 -
            // ascii 43 +
            // ascii 46 .
            // ascii 48 to 57 for numbers

            if(ascii == 32) {
                if(!result.equals("")) {
                    break;
                }
                continue;
            }

            if(ascii == 46) {
                break;
            }

            if(ascii == 45 || ascii == 43 || (ascii >= 48 && ascii <= 57)) {
                if(!result.equals("") && (ascii == 45 || ascii == 43)) {
                    return 0;
                }
                result += letter;
            } else {
                break;
            }

            if(ascii == 45 || ascii == 43) {
                operatorCount++;
            }
            if (operatorCount >= 2) {
                return 0;
            }
        }
        Double resultValue = !result.equals("") && !result.equals("-") && !result.equals("+")? Double.valueOf(result) : 0;
        return resultValue > Integer.MAX_VALUE || resultValue < Integer.MIN_VALUE ? Integer.MIN_VALUE : resultValue.intValue();
    }



    public int myAtoi2(String s) {

        String result = "";
        boolean isFirstCharNonNum = true;
        boolean isNegative = false;
        boolean isPositive = false;
        for(int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            char character = s.charAt(i);
            int ascii = (int) character;

            // ascii 46 .
            // ascii 65 to 122 for alphabets
            // ascii 45 -
            // ascii 43 +
            // ascii 46 .
            // ascii 48 to 57 for numbers

            if(ascii == 32) {
                continue;
            }
            if(ascii == 46) {
                break;
            }
            if(ascii == 45 || ascii == 43 || (ascii >= 48 && ascii <= 57)) {
                if(ascii == 45) {
                    isNegative = true;
                }
                if(ascii == 43) {
                    isPositive = true;
                }
                result += letter;
                isFirstCharNonNum = false;
            }
            if(isFirstCharNonNum || (isPositive && isNegative)) {
                return 0;
            }

        }
        Long resultValue = !result.equals("") && !result.equals("-") && !result.equals("+")? Long.valueOf(result) : 0;
        return resultValue > Integer.MAX_VALUE ? Integer.MAX_VALUE :
                resultValue < Integer.MIN_VALUE ? Integer.MIN_VALUE : resultValue.intValue();
    }
}
