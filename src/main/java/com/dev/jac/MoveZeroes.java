package com.dev.jac;

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {

        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                if(i != j) {
                    nums[i] = 0;
                }
                ++j;
            }
        }
        for(int count=j; count < nums.length; count++) {
            nums[j++] = 0;
        }
        return nums;
    }

}
