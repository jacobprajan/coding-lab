package com.dev.msb;

public class IntToRoman {
    public static void main(String args[]) {
        System.out.println("III => " + intToRoman(3));
        System.out.println("LVIII => " + intToRoman(58));
        System.out.println("MCMXCIV => " + intToRoman(1994));
        System.out.println("MCMXCIV => " + intToRoman(2994));
        System.out.println("MCMXCIV => " + intToRoman(3994));
        System.out.println("XLII => " + intToRoman(42));
        System.out.println("V => " + intToRoman(5));
    }

    private static String intToRoman(int num) {
        return getValue(num, "");
    }

    private String getRomanString(int num, String romanStr) {
        if (num > 0) {

            if ((num / 1000) > 1) {
                int quotient = num / 1000;
                return getRomanString(num - (quotient * 1000), "M".repeat(quotient));
            } else if ((num / 900) > 1) {
                return getRomanString(num - 900, "M");
            }
        }
        return romanStr;
    }


    private static String intToRoman1(int num) {
        return getValue(num, "");
    }

    private static String getValue(int num, String romanStr) {
        if (num > 0) {
            if (num >= 1000) {
                return "M" + getValue(num - 1000, "");
            } else if (num >= 900) {
                return "CM" + getValue(num - 900, "");
            } else if (num >= 500) {
                return "D" + getValue(num - 500, "");
            } else if (num >= 400) {
                return "CD" + getValue(num - 400, "");
            } else if (num >= 100) {
                return "C" + getValue(num - 100, "");
            } else if (num >= 90) {
                return "XC" + getValue(num - 90, "");
            } else if (num >= 50) {
                return "L" + getValue(num - 50, "");
            } else if (num >= 40) {
                return "XL" + getValue(num - 40, "");
            } else if (num >= 10) {
                return "X" + getValue(num - 10, "");
            } else if (num >= 9) {
                return "IX" + getValue(num - 9, "");
            } else if (num >= 5) {
                return "V" + getValue(num - 5, "");
            } else if (num >= 4) {
                return "IV" + getValue(num - 4, "");
            } else {
                return "I" + getValue(num - 1, "");
            }
        }
        return romanStr;
    }

    private static StringBuffer getValue(int num, StringBuffer romanStr) {
        if (num > 0) {
            if (num >= 1000) {
                return romanStr.append("M").append(getValue(num - 1000, new StringBuffer()));
            } else if (num >= 900) {
                return romanStr.append("CM").append(getValue(num - 900, new StringBuffer()));
            } else if (num >= 500) {
                return romanStr.append("D").append(getValue(num - 500, new StringBuffer()));
            } else if (num >= 400) {
                return romanStr.append("CD").append(getValue(num - 400, new StringBuffer()));
            } else if (num >= 100) {
                return romanStr.append("C").append(getValue(num - 100, new StringBuffer()));
            } else if (num >= 90) {
                return romanStr.append("XC").append(getValue(num - 90, new StringBuffer()));
            } else if (num >= 50) {
                return romanStr.append("L").append(getValue(num - 50, new StringBuffer()));
            } else if (num >= 40) {
                return romanStr.append("XL").append(getValue(num - 40, new StringBuffer()));
            } else if (num >= 10) {
                return romanStr.append("X").append(getValue(num - 10, new StringBuffer()));
            } else if (num >= 9) {
                return romanStr.append("IX").append(getValue(num - 9, new StringBuffer()));
            } else if (num >= 5) {
                return romanStr.append("V").append(getValue(num - 5, new StringBuffer()));
            } else if (num >= 4) {
                return romanStr.append("IV").append(getValue(num - 4, new StringBuffer()));
            } else {
                return romanStr.append("I").append(getValue(num - 1, new StringBuffer()));
            }
        }
        return romanStr;
    }
}
