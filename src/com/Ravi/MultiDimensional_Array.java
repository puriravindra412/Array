package com.Ravi;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional_Array {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       // Declaration:
            int[][] arr2D = new int[3][3];
       //input/initialization
            for(int rows =0;rows<arr2D.length;rows++)
                for (int col = 0; col<arr2D[rows].length ; col++) {
                    arr2D[rows][col] = in.nextInt();
                }
        //Print
        for (int row=0;row<arr2D.length;row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }

    }
}
