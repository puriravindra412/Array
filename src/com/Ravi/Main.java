package com.Ravi;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//
//         syntax :{
//                declaration:
//                    datatype[] name = new datatype[size];
//                example:
//                    int [] roll_no = new int[5];
//
//
//                initialization:
//                    name[index]=value;
//                example:
//                    roll_no[0] =5;
//
//                    note:index start from 0 and up to size-1 of array.
//
//        input and initialize manually:
                    Scanner in =  new Scanner(System.in);
                    int[] arr= new int[5];

                    arr[0]=15;
                    arr[1]=20;
                    arr[2]=30;
                    arr[3]=40;
                    arr[4]=50;
                    System.out.println(arr[0]);
    }
}