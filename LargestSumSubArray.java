package com.company.algorithms.array.list;

public class LargestSumSubArray {
    public static void main(String[] args){
        int array[]={3,-9,5,10,-2,10,-20};
        System.out.println(findMaxSum(array));
    }
    public static int findMaxSum(int[] array){
        int maxSum=Integer.MIN_VALUE,maxSumNow=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            maxSumNow=maxSumNow+array[i];
            if(maxSumNow>maxSum){
                maxSum=maxSumNow;
            }
            if(maxSumNow<0){
                maxSumNow=0;
            }
        }
        return maxSum;
    }
}
