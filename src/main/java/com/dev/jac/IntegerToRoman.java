package com.dev.jac;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

    public String intToRoman(int num) {

        if(num < 1 || num > 3999) {
            return "Value of input is 1 <= num <= 3999";
        }

        Map<Integer, String> map= new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
//        map.put(8, "VIII");
//        map.put(7, "VII");
//        map.put(6, "VI");
        map.put(5, "V");
        map.put(4, "IV");
//        map.put(3, "III");
//        map.put(2, "II");
        map.put(1, "I");

        String result= "";

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
           while((num - entry.getKey()) >= 0) {
               result += entry.getValue();
               num = num - entry.getKey();
           }
           if(num < 0) {
                break;
           }
        }
        return result;
    }
}
