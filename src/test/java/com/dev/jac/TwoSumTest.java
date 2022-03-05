package com.dev.jac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    @DisplayName("2, 7, 11, 15 and target 9")
    void testSum() {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int expected[] = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target), "Should return 0 and 1");
    }

    @Test
    @DisplayName("3,2,4 and target 6")
    void testSum2() {
        int nums[] = {3, 2, 4};
        int target = 6;
        int expected[] = {1, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target), "Should return 1 and 2");
    }

    @Test
    @DisplayName("3,3 and target 6")
    void testSum3() {
        int nums[] = {3, 3};
        int target = 6;
        int expected[] = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target), "Should return 0 and 1");
    }

    @Test
    @DisplayName("-1,3,2 and target 1")
    void testSum4() {
        int nums[] = {-1, 3, 2};
        int target = 1;
        int expected[] = {0, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target), "Should return 0 and 2");
    }

    @Test
    @DisplayName("-1, 3, 2 and target -1")
    void testSum5() {
        int nums[] = {-1, 3, 2};
        int target = 1;
        int expected[] = {0, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target), "Should return 0 and 2");
    }

    @Test
    @DisplayName("1,3,-2 and target 5")
    void testSum6() {
        int nums[] = {1, 3, -2};
        int target = 5;
        int expected[] = {-1, -1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target), "Should return -1 and -1");
    }


}

