package com.dev.msb;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String args[]) {
        int[] v = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        System.out.println("Original Array: " + Arrays.toString(v));

//        moveZerosToLeft(v);
        moveZeroesToRight(v);

        System.out.println("After Moving Zeroes to Left: " + Arrays.toString(v));

        v = new int[]{0, 1, 0, 0, 20, 0, 59, 63, 0, 88, 0};
        System.out.println("Original Array: " + Arrays.toString(v));
        moveZeroesToRight(v);
        System.out.println("After Moving Zeroes to Left: " + Arrays.toString(v));
    }

    public static void moveZeroesToRight(int[] nums) {
        int writeIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                writeIndex = i; // found writeIndex
                break;
            }
        }

        if (writeIndex >= 0) {
            for (int readIndex = writeIndex; readIndex < nums.length; readIndex++) {
                if (nums[readIndex] != 0) {
                    nums[writeIndex] = nums[readIndex];
                    nums[readIndex] = 0;
                    writeIndex += 1;
                }
            }
        }
    }

    private static void moveZerosToLeft(int[] nums) {
        int writeIndex = nums.length - 1;
        for (int readIndex = nums.length - 1; readIndex >= 0; readIndex--) {
            if (nums[readIndex] != 0) {
                nums[writeIndex] = nums[readIndex];
                nums[readIndex] = 0;
                writeIndex -= 1;
            }
        }
    }
}
