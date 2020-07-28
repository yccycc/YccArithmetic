package com.example.yccarithmetic;

import java.util.Arrays;

class SelectSort {
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // 用来记录最小值的索引位置，默认值为i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
                }
            }
            // 交换当前索引 i 和最小值索引 minIndex 两处的值
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            // 执行完一次循环，当前索引 i 处的值为最小值，直到循环结束即可完成排序
        }
    }
}

public class YcSelectSortTest {

    public static void main(String[] args) {
        int a[] = {2,1,5,3,9,8,6,7,4,10,10,7};
        //yccSelectSort(a);
        //SelectSort.selectSort(a);
        yccSelectSortOpt(a);
        System.out.println(Arrays.toString(a));
    }



    public static void yccSelectSort(int a[]){
        for (int i=0;i<a.length;i++){
            int minIndex = min(a,i);
            int tmp = a[minIndex];
            a[minIndex] = a[i];
            a[i]=tmp;
        }
    }

    public static void yccSelectSortOpt(int a[]){
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

    public static int min(int a[],int begin){
        for (int i=begin;i<a.length;i++){
            boolean shouldContinue = false;
            for (int j=begin;j<a.length;j++){
                if (a[i]>a[j]){
                    shouldContinue = true;
                }
            }
            if (!shouldContinue){
                return i;
            }
        }
        return 0;
    }
}
