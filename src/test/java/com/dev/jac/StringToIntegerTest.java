package com.dev.jac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    StringToInteger stringToInteger;

    @BeforeEach
    void setUp() {
        stringToInteger = new StringToInteger();
    }

    @Test
    @DisplayName("Integer value of 42 is 42")
    void testStringToInteger1() {
        String input = "42";
        int expected = 42;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 42");
    }

    @Test
    @DisplayName("Integer value of '   -42' is -42")
    void testStringToInteger2() {
        String input = "    -42";
        int expected = -42;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return -42");
    }

    @Test
    @DisplayName("Integer value of '4193 with words' is 4193")
    void testStringToInteger3() {
        String input = "4193 with words";
        int expected = 4193;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 4193");
    }

    @Test
    @DisplayName("Integer value of 'words and 987' is 0")
    void testStringToInteger4() {
        String input = "words and 987";
        int expected = 0;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 0");
    }

    @Test
    @DisplayName("Integer value of -91283472332 is " + Integer.MIN_VALUE)
    void testStringToInteger5() {
        String input = "-91283472332";
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return " + Integer.MIN_VALUE);
    }

    @Test
    @DisplayName("Integer value of 3.14 is 3")
    void testStringToInteger6() {
        String input = "3.14";
        int expected = 3;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 3");
    }

    @Test
    @DisplayName("Integer value of +-12 is 0")
    void testStringToInteger7() {
        String input = "+-12";
        int expected = 0;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 0");
    }

    @Test
    @DisplayName("Integer value of -+12 is 0")
    void testStringToInteger8() {
        String input = "-+12";
        int expected = 0;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 0");
    }

    @Test
    @DisplayName("Integer value of '' is 0")
    void testStringToInteger9() {
        String input = "";
        int expected = 0;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 0");
    }

    @Test
    @DisplayName("Integer value of - is 0")
    void testStringToInteger10() {
        String input = "-";
        int expected = 0;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 0");
    }

    @Test
    @DisplayName("Integer value of + is 0")
    void testStringToInteger11() {
        String input = "+";
        int expected = 0;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 0");
    }

    @Test
    @DisplayName("Integer value of +1 is 1")
    void testStringToInteger12() {
        String input = "+1";
        int expected = 1;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 1");
    }

    @Test
    @DisplayName("Integer value of 00000-42a1234 is 0")
    void testStringToInteger13() {
        String input = "00000-42a1234";
        int expected = 0;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return 0");
    }

    @Test
    @DisplayName("Integer value of '  -0012a42' is -12")
    void testStringToInteger14() {
        String input = "  -0012a42";
        int expected = -12;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return -12");
    }

    @Test
    @DisplayName("Integer value of 20000000000000000000 is " + Integer.MIN_VALUE)
    void testStringToInteger15() {
        String input = "20000000000000000000";
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return " + Integer.MIN_VALUE);
    }

    @Test
    @DisplayName("Integer value of 21474836460 is " + Integer.MAX_VALUE)
    void testStringToInteger16() {
        String input = "21474836460";
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, stringToInteger.myAtoi(input), "Should return " + Integer.MAX_VALUE);
    }

}