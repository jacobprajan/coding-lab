package com.dev.jac;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int n : nums) {
            int otherNum = target - n;
            if(map.containsKey(otherNum)) {
                return new int[]{map.get(otherNum), index};
            }
            map.put(n, index);
            ++index;
        }
        return new int[]{-1, -1};
    }

}
