package com.example.yccarithmetic;

import java.util.Arrays;

public class YccInsertSort {
    public static void main(String[] args) {
        int a[] = {1000,2,1,5,3,9,8,6,7,4,10,10,7};
        //int a[] = {1000,2,1};
        yccInsertSort(a);
       // insertSort(a);
        System.out.println(Arrays.toString(a));
    }
// 2 4 6  5
    private static void yccInsertSort(int[] a) {
        //int[] b = new int[a.length];
        for (int i=1;i<a.length;i++){
            int newValue = a[i];
            int j;
            for (j=i-1;j>=0;j--){
                if (a[j] >= newValue){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = newValue;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void insertSort(int[] arr) {
        //从i=1 开始，因为单独一个元素arr[0]是有序的；
        for(int i = 1;i < arr.length;i++) {
            //从无序数列中取出一个元素赋值给temp
            int temp = arr[i];
            int t = i-1;
            //不断往前寻找，直到找到比temp小的值或者t小于0为止
            while(t >= 0 && arr[t] > temp) {
                arr[t + 1] = arr[t];
                t--;
            }
            //将temp插在其之后
            arr[t+1] = temp;

        }
    }
}
