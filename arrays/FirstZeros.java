package com.arrays;

import java.util.Arrays;

public class FirstZeros{
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 8, 0, 0, 0,9};
        int[] b=new int[arr.length];
        int j=0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            b[j++]=0;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                b[j++]=arr[i];
            }
        }
    System.out.println(Arrays.toString(b));
    }
}