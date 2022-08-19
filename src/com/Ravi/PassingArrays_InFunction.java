package com.Ravi;
import java.util.*;
public class PassingArrays_InFunction {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] nums ={1,2,12,20,9};
        System.out.println(Arrays.toString(nums));
        System.out.println(change(nums));
    }

    private static int change(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }


}
