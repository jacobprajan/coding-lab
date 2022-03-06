package com.dev.jac;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public String intToRoman(int num) {

        if(num < 1 || num > 3999) {
            return "Value of input is 1 <= num <= 3999";
        }

        Map<Integer, String> map= new HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(900, "CM");
        map.put(1000, "M");

        String result= "";
        int exp = 0;
        do {
            int digit = num % 10;
            num = num / 10;
            int value = digit * ((int) Math.pow(10.0, exp));
            result = map.get(value) != null? (map.get(value) + result) : result;
            ++exp;

        } while(num > 0);

        return result;
    }

}
