package com.company.algorithms.array.list;

public class ContinuousOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1};
        findContinuousOne(arr);
    }
    static void findContinuousOne(int[] arr){
        int maxCountTillNow = 0, maxCount = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                maxCountTillNow++;
                maxCount = Integer.max(maxCount, maxCountTillNow);
            }
            else{
                maxCountTillNow = 0;
            }
        }
        System.out.println(maxCount);

    }
}
