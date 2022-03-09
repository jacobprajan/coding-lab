package com.dev.jac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    MoveZeroes moveZeroes;

    @BeforeEach
    void setUp() {
        moveZeroes = new MoveZeroes();
    }

    @Test
    @DisplayName("0,1,0,3,12")
    void moveZeroes1() {
        int nums[] = {0,1,0,3,12};
        int expected[] = {1,3,12,0,0};
        assertArrayEquals(expected, moveZeroes.moveZeroes(nums), "Should return {1,3,12,0,0}");
    }

    @Test
    @DisplayName("0")
    void moveZeroes2() {
        int nums[] = {0};
        int expected[] = {0};
        assertArrayEquals(expected, moveZeroes.moveZeroes(nums), "Should return {0}");
    }

    @Test
    @DisplayName("1")
    void moveZeroes3() {
        int nums[] = {1};
        int expected[] = {1};
        assertArrayEquals(expected, moveZeroes.moveZeroes(nums), "Should return {1}");
    }

}