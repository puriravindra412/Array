package com.Ravi;
import java.util.*;


public class MaxElement {
    public static void main(String[] args) {
        int[] arr={10,4,6,8,19,15};
        System.out.println(maximum(arr));
    }

    private static int maximum(int[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }




}
