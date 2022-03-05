package com.dev.msb;

import java.util.Map;

public class RomanToInt {
    public static void main(String args[]) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IVII"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    private static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 <= s.length() && romanConstants.containsKey(s.substring(i, i + 2))) {
                sum += romanConstants.get(s.substring(i, i + 2));
                i += 1;
            } else if (romanConstants.containsKey(s.substring(i, i + 1))) {
                sum += romanConstants.get(s.substring(i, i + 1));
            } else {
                return 0;
            }
        }

        return sum;
    }

    private static Map<String, Integer> romanConstants = Map.ofEntries(
            Map.entry("I", 1),
            Map.entry("V", 5),
            Map.entry("X", 10),
            Map.entry("L", 50),
            Map.entry("C", 100),
            Map.entry("D", 500),
            Map.entry("M", 1000),
            Map.entry("CM", 900),
            Map.entry("CD", 400),
            Map.entry("XC", 90),
            Map.entry("XL", 40),
            Map.entry("IX", 9),
            Map.entry("IV", 4)
    );
}
