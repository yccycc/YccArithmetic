package com.example.yccarithmetic;

import java.util.Arrays;

public class YccBubbleSort {
    public static void main(String[] args) {
        int a[] = {1001,2,1,5,3,9,8,6,7,4,10,10,7};
        yccBubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void yccBubbleSort(int a[]){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }

    }
}
