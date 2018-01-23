package com.suyash.app;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Madhuri on 9/29/17.
 */
public class SumTargerTest {

    @Test
    public void checkTwoSum(){

        int[] input={2,4,7,3};
        int[] output={0,2};

        SumTarget sumTarget= new SumTarget();
        assertArrayEquals(output,sumTarget.twoSum(input,9));

    }
}
