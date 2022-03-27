package com.dev.jac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CafteriaDinersTest {

    CafteriaDiners cafteriaDiners;

    @BeforeEach
    void setUp() {
        cafteriaDiners = new CafteriaDiners();
    }

    @Test
    @DisplayName("getMaxAdditionalDinersCount1")
    void getMaxAdditionalDinersCount1() {
        long N = 10;
        long K = 1;
        int M = 2;
        long[] S = new long[] {2, 6};
        long expected = 3;
        assertEquals(expected, cafteriaDiners.getMaxAdditionalDinersCount(N, K, M, S), "Should return count");
    }

    @Test
    @DisplayName("getMaxAdditionalDinersCount2")
    void getMaxAdditionalDinersCount2() {
        long N = 15;
        long K = 2;
        int M = 3;
        long[] S = new long[] {11, 6, 14};
        long expected = 1;         // 3 6 11 14
        assertEquals(expected, cafteriaDiners.getMaxAdditionalDinersCount(N, K, M, S), "Should return count");
    }

    @Test
    @DisplayName("getMaxAdditionalDinersCount3")
    void getMaxAdditionalDinersCount3() {
        long N = 20;
        long K = 1;
        int M = 2;
        long[] S = new long[] {10, 14};
        long expected = 8;    //   2 4 6 8 10 12 14 16 18 20
        assertEquals(expected, cafteriaDiners.getMaxAdditionalDinersCount(N, K, M, S), "Should return count");
    }

}