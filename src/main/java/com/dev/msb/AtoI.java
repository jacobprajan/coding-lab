package com.dev.msb;

public class AtoI {
    public static void main(String args[]) {
//        System.out.println("-12345 : " + myAtoi("-12345"));
//        System.out.println("   -42 : " + myAtoi("   -42"));
        System.out.println("2147483646 : " + myAtoi("2147483648"));
//        System.out.println("-999999999999asdas : " + myAtoi("-999999999999"));
//        System.out.println("999999999999 : " + myAtoi("999999999999"));
    }

    private static int myAtoi(String s) {
        if (null == s || "".equals(s.trim())) {
            return 0; // can't find a better value to return
        }

        s = s.trim(); // remove/ignore unwanted space characters
        boolean isNegative = s.charAt(0) == '-';
        int responseInt = 0;
        int index = (s.charAt(0) == '-' || s.charAt(0) == '+') ? 1 : 0;
        for (; index < s.length() && Character.isDigit(s.charAt(index)); index++) {
            int inputDigit = Integer.parseInt(s.charAt(index) + "");
            if ((responseInt + inputDigit) > (Integer.MAX_VALUE / 10 + 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            responseInt = responseInt * 10 + inputDigit;
        }

        return isNegative ? responseInt * -1 : responseInt;
    }



    private static int myAtoi123(String input) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int n = input.length();

        // Discard all spaces from the beginning of the input string.
        while (index < n && input.charAt(index) == ' ') {
            index++;
        }

        // sign = +1, if it's positive number, otherwise sign = -1.
        if (index < n && input.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (index < n && input.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        // Traverse next digits of input and stop if it is not a digit
        while (index < n && Character.isDigit(input.charAt(index))) {
            int digit = input.charAt(index) - '0';

            // Check overflow and underflow conditions.
            if ((result > Integer.MAX_VALUE / 10) ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Append current digit to the result.
            result = 10 * result + digit;
            index++;
        }

        // We have formed a valid number without any overflow/underflow.
        // Return it after multiplying it with its sign.
        return sign * result;
    }
}