package com.suyash.app;

/**
 * Created by Madhuri on 9/29/17.
 */
public class SumTarget {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
                                                                // Check for first number - target number
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }

        }
        throw new IllegalArgumentException();
    }

    // Time complexity: n2
    // Space complexity: constant


}
