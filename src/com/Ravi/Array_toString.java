package com.Ravi;
import java.util.*;

public class Array_toString {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] arr =new int[n];
        for (int i=0 ;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}

