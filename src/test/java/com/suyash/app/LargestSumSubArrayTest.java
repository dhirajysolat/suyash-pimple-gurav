package com.suyash.app;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Madhuri on 9/10/17.
 */
public class LargestSumSubArrayTest {



    @Test
    public void checkMaxArraywithNumbers(){

        int[] input={2,2,5,-3,-7,7,2,1};

        LargestSumSubArray sumSubArray= new LargestSumSubArray();
        assertEquals(10,sumSubArray.maxSum(input));

    }
}
