package com.company.algorithms.array.list;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        //findLongestSubString("LoLngestSubString");
        findLongestSubStringSlidingWindow("LoLngestSubString");
    }
    //Using Sliding Window technique
    static void findLongestSubStringSlidingWindow(String arr){
        int maxLength = Integer.MIN_VALUE;

        String subString="";
        boolean[] visited = new boolean[256];
        for(int i=0;i<arr.length();i++){
            if(!subString.contains(String.valueOf(arr.charAt(i)))){
                subString=subString + arr.charAt(i);
            }
            else{
                subString=subString.substring(subString.indexOf(arr.charAt(i))+1);
                subString=subString + arr.charAt(i);


            }
            if(maxLength<subString.length()){
                maxLength=subString.length();
                System.out.println(subString);
            }
        }
        System.out.println(maxLength);
    }
    //Using Sliding Window technique
    static void findLongestSubString(String arr){
        int maxLength = Integer.MIN_VALUE;
        boolean[] visited = new boolean[256];
        for(int i=0;i<arr.length();i++){
            for(int j=i;j<arr.length();j++){
                if(!visited[arr.charAt(j)]){
                    maxLength = Integer.max(maxLength, j-i+1);
                    visited[arr.charAt(j)]=true;
                }
                else
                    break;
            }
            visited[arr.charAt(i)]=false;
        }
        System.out.println(maxLength);
    }
}
