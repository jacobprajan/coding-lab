package com.dev.jac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger romanToInteger;

    @BeforeEach
    void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    @DisplayName("Integer value of null is -1")
    void testRoman1() {
        String roman = null;
        int expected = -1;
        assertEquals(expected, romanToInteger.romanToInt(roman), "Should return -1");
    }

    @Test
    @DisplayName("Integer value of IIGI is -1")
    void testRoman2() {
        String roman = "IIGI";
        int expected = -1;
        assertEquals(expected, romanToInteger.romanToInt(roman), "Should return -1");
    }


    @Test
    @DisplayName("Integer value of III is 3")
    void testRoman3() {
        String roman = "III";
        int expected = 3;
        assertEquals(expected, romanToInteger.romanToInt(roman), "Should return 3");
    }

    @Test
    @DisplayName("Integer value of LVIII is 58")
    void testRoman4() {
        String roman = "LVIII";
        int expected = 58;
        assertEquals(expected, romanToInteger.romanToInt(roman), "Should return 58");
    }

    @Test
    @DisplayName("Integer value of IV is 4")
    void testRoman5() {
        String roman = "IV";
        int expected = 4;
        assertEquals(expected, romanToInteger.romanToInt(roman), "Should return 4");
    }

    @Test
    @DisplayName("Integer value of MCMXCIV is 1994")
    void testRoman6() {
        String roman = "MCMXCIV";
        int expected = 1994;
        assertEquals(expected, romanToInteger.romanToInt(roman), "Should return 1994");
    }


}