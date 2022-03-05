package com.dev.msb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]) {
//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
//        System.out.println(Arrays.toString(twoSum(new int[]{9, 5, 7, 3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-3, 4, 3, 90}, 0)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> tempMap = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            if (tempMap.containsKey(target - nums[index])) {
                result[0] = tempMap.get(target - nums[index]);
                result[1] = index;
                break;
            } else {
                tempMap.put(nums[index], index);
            }
        }

        return result;
    }
}
