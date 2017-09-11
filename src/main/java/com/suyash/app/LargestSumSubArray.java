package com.suyash.app;

/**
 * Created by Madhuri on 9/10/17.
 */
public class LargestSumSubArray {



    public int maxSum(int[] input){

        int[] maxSum=new int[input.length+1];

        maxSum[0]=0;
        for(int i=1;i<maxSum.length;i++){
            maxSum[i] =Math.max(maxSum[i-1]+input[i-1],input[i-1]);  // Get Maximum sum with starting index i
        }
        int result=0;
        for(int i=0;i<maxSum.length;i++){
            if(maxSum[i]>result){                                      //return index with maximum sum
                result=maxSum[i];
            }
        }
        return result;
    }


}
