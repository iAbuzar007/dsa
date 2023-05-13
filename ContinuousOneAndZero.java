package com.company.algorithms.array.list;

import java.util.ArrayList;
import java.util.List;

public class ContinuousOneAndZero {
    public static void main(String[] args) {
        findContinuousOneAndZero(new int[]{1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1}, 5);
    }
    static void findContinuousOneAndZero(int[] arr, int k){
        // Maintain a list of K size and store index of each zero
        List<Integer> list = new ArrayList<>();
        int maxLength=Integer.MIN_VALUE, currLength=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                list.add(i);
            }
            //when list of 0's is more than k, then current length should be 1st and last index of zero
            if(list.size()>k){
                currLength=list.get(list.size()-1)-list.get(0)-1;
                list.remove(list.get(0));
            }
            currLength++;
            if(currLength>maxLength){
                maxLength=currLength;
            }
        }
        System.out.println(maxLength);
    }
}
