package com.dev.jac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    GenerateParentheses generateParentheses;

    @BeforeEach
    void setUp() {
        generateParentheses = new GenerateParentheses();
    }

    @Test
    @DisplayName("generateParentheses of 1")
    void generateParenthesis1() {
        int input = 1;
        List<String> expected = List.of("()");
        assertEquals(expected, generateParentheses.generateParenthesis(input), "Should return parentheses");
    }

    // Fix me
    @Test
    @DisplayName("generateParentheses of 2")
    void generateParenthesis2() {
        int input = 2;
        List<String> expected = List.of("(())","()()");
        assertEquals(expected, generateParentheses.generateParenthesis(input), "Should return parentheses");
    }

    // Fix me
    @Test
    @DisplayName("generateParentheses of 3")
    void generateParenthesis3() {
        int input = 3;
        List<String> expected = List.of("((()))","(()())","(())()","()(())","()()()");
        assertEquals(expected, generateParentheses.generateParenthesis(input), "Should return parentheses");
    }


}