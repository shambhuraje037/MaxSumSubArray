package com.company.Sliding;

public class MaxSumArray {
    public int findMaxSumArray(int[] arr, int k){
        int maxSum= Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0; i<arr.length; i++){
            currentSum+=arr[i];
            if(i>= k-1){
                if(currentSum>maxSum) maxSum = currentSum;
                currentSum-=arr[i-(k-1)];
            }
        }
        return maxSum;
    }
}
