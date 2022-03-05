package com.dev.jac;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        Map<String, Integer> map= new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            Integer convertedValue = map.get(letter) != null ? map.get(letter) : 0;
            String previousLetter = (i-1) >= 0 ? String.valueOf(s.charAt(i-1)) : "";
            Integer previousValue = map.get(previousLetter) != null ? map.get(previousLetter) : 0;
            if(isIVOrIX(letter, previousLetter) || isXLOrXC(letter, previousLetter) || isCDOrCM(letter, previousLetter)) {
                sum = sum - previousValue + convertedValue - previousValue;
            } else {
                sum += convertedValue;
            }
        }
        return sum;
    }

    private boolean isIVOrIX(String letter, String previousLetter) {
        return "I".equals(previousLetter) && ("V".equals(letter) || "X".equals(letter));
    }

    private boolean isXLOrXC(String letter, String previousLetter) {
        return "X".equals(previousLetter) && ("L".equals(letter) || "C".equals(letter));
    }

    private boolean isCDOrCM(String letter, String previousLetter) {
        return "C".equals(previousLetter) && ("D".equals(letter) || "M".equals(letter));
    }
}
