package com.Ravi;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        //declare array:
        int[] arr =new int[n];
        //initialize using for loop
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        //print array using for loop
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


}
