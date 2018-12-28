package com.company.algorithms.arraySum;

public class ArraySum {
    /*
        PROBLEM DEFINITION:
        Given an array of integers, find the sum of its elements.
     */
    
    /**
     * Basic sum function for an integer array. Does not handle int data type overflows.
     * @param values The values to sum.
     * @return The sum of the values of the provided array.
     * @throws IllegalArgumentException If values is null or empty.
     */
    public static int sum(final int[] values) throws IllegalArgumentException{
        if(values == null || values.length == 0){
            throw new IllegalArgumentException("A valid array of numeric values must be provided");
        }

        int sumValue = 0;

        for(int i = 0; i < values.length; i++){
            sumValue += values[i];
        }

        return sumValue;
    }
}
