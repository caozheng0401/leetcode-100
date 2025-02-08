package com.cz.leetcode;

import java.util.*;

public class testCode {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        if (nums.length == 0 || null == nums){
            return 0;
        }

        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        for (Integer i : numsSet) {
            if (numsSet.contains(i-1)){
                continue;
            }
            int y = i+1;
            while (numsSet.contains(y)){
                y++;
            }
            int length = y -i;
            res = Math.max(res,length);
        }
        return res;


    }
//    public int longestConsecutive(int[] nums) {
//        if (nums.length == 0 || null == nums){
//            return 0;
//        }
//        Arrays.sort(nums);
//        int res = 1;
//        ArrayList<Integer> temp = new ArrayList<>();
//        temp.add(nums[0]);
//        int length = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (temp.contains(nums[i])) continue;
//           if (temp.contains(nums[i] - 1)){
//               length++;
//           }else {
//               length =1 ;
//           }
//           temp.add(nums[i]);
//           if (length > res){
//               res = length;
//           }
//        }
//        return res;
//    }
}
