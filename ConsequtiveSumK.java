package com.company.algorithms.array.list;

public class ConsequtiveSumK {
    public static void main(String[] args) {
        findMaxSumWithSlidingWindow(new int[]{10, 20, 105, -10, 30, 40, 50, 20}, 3);
    }
    static void findMaxSum1(int[] arr, int k){
        int maxSum= Integer.MIN_VALUE, sumTillNow=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length && j-i<=k;j++){
                sumTillNow = sumTillNow+arr[j];
                if(maxSum<sumTillNow){
                    maxSum = sumTillNow;
                }
            }
            sumTillNow = 0;
        }
    }
    static void findMaxSumWithSlidingWindow(int[] arr, int k){
        int maxSum= Integer.MIN_VALUE, sumTillNow=0;
        if(arr.length>=k){
            for(int i=0;i<k;i++)
                sumTillNow=sumTillNow+arr[i];
        }
        maxSum=sumTillNow;
        for(int i=k,  j=0;i<arr.length;i++){
            sumTillNow = sumTillNow+arr[i]-arr[j];
            if(maxSum<sumTillNow){
                maxSum = sumTillNow;
            }
            j++;
        }
        System.out.println(maxSum);
    }
}
