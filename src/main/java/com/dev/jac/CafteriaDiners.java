package com.dev.jac;

// https://leetcode.com/discuss/interview-question/1376859/facebook-puzzle

import java.util.Arrays;

public class CafteriaDiners {

    // N -> total no of seats
    // K -> no of seats to be vacant on left and right
    // M -> no of current diners
    // S -> ith position at which diner sits

    public long getMaxAdditionalDinersCount(long N, long K, int M, long[] S) {

        Arrays.sort(S);
        long count = 0;
        long min = 0;
        for(int i=S.length; i>0; i--) {
           long max = i == S.length ? N : S[i]-1;
           min = S[i-1]+1;
           double ceil = Math.ceil((max - min) / (K * 2));
           count += Double.valueOf(ceil).longValue();
        }
        if(min > 0) {
            double ceil = Math.ceil((min-1) / (K * 2));
            count += Double.valueOf(ceil).longValue();
        }
        return count;
    }
}
