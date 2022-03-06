package com.dev.jac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    IntegerToRoman integerToRoman;

    @BeforeEach
    void setUp() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    @DisplayName("Value of input is 1 <= num <= 3999")
    void testIntToRoman1() {
        Integer input = 0;
        String expected = "Value of input is 1 <= num <= 3999";
        assertEquals(expected, integerToRoman.intToRoman(input), "Value of input is 1 <= num <= 3999");
    }

    @Test
    @DisplayName("Roman value of 3 is III")
    void testIntToRoman2() {
        Integer input = 3;
        String expected = "III";
        assertEquals(expected, integerToRoman.intToRoman(input), "Should return III");
    }

    @Test
    @DisplayName("Roman value of 58 is LVIII")
    void testIntToRoman3() {
        Integer input = 58;
        String expected = "LVIII";
        assertEquals(expected, integerToRoman.intToRoman(input), "Should return LVIII");
    }

    @Test
    @DisplayName("Roman value of 1994 is MCMXCIV")
    void testIntToRoman4() {
        Integer input = 1994;
        String expected = "MCMXCIV";
        assertEquals(expected, integerToRoman.intToRoman(input), "Should return MCMXCIV");
    }

    @Test
    @DisplayName("Roman value of 20 is XX")
    void testIntToRoman5() {
        Integer input = 20;
        String expected = "XX";
        assertEquals(expected, integerToRoman.intToRoman(input), "Should return XX");
    }

    @Test
    @DisplayName("Roman value of 9 is IX")
    void testIntToRoman6() {
        Integer input = 9;
        String expected = "IX";
        assertEquals(expected, integerToRoman.intToRoman(input), "Should return IX");
    }


}