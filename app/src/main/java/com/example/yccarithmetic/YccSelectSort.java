package com.example.yccarithmetic;

import java.util.Arrays;

public class YccSelectSort {
    public static void main(String[] args) {
        int a[] = {1000,2,1,5,3,9,8,6,7,4,10,10,7};
        yccSelectSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void yccSelectSort(int a[]){
        for (int i=0;i<a.length;i++){
            int minIndex = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
