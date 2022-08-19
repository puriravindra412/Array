package com.Ravi;
import java.util.Scanner;
import java.util.Arrays;
public class SwapElement {
    public static void main(String[] args) {
        //Scanner in =new Scanner(System.in);
        int [] arr ={10,3,6,19};
        int first=1,last=3;
        swap(arr,first,last);
    }

    public static void swap(int[]arr,int n,int k) {
        int temp=arr[n];
        arr[n]=arr[k];
        arr[k]=temp;
        System.out.println( Arrays.toString(arr));
    }
}
