package com.example.yccarithmetic;

import java.util.Arrays;

public class YccQuickSort {
    public static void main(String[] args) {
        int[] numbers = {3,45,78,64,52,11,64,55,99,11,18,200,1};
        System.out.println(arrayToString(numbers,"未排序"));

        quickSort(numbers,0,numbers.length-1);

        System.out.println(arrayToString(numbers,"排序"));
        System.out.println("数组个数："+numbers.length);;
    }

                      //quickSort(numbers,       0,        numbers.length-1);
    private static void quickSort(int[] numbers, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if(left>=right) {
            return;
        }
        //设置最左边的元素为基准值
        int key=numbers[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i=left;
        int j=right;
        while(i<j){
            //j向左移，直到遇到比key小的值
            while(numbers[j]>=key && i<j){
                j--;
            }
            //i向右移，直到遇到比key大的值
            while(numbers[i]<=key && i<j){
                i++;
            }
            //i和j指向的元素交换
            if(i<j){
                int temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
            }
        }
        numbers[left]=numbers[i];
        numbers[i]=key;
        quickSort(numbers,left,i-1);
        quickSort(numbers,i+1,right);
    }

    private static String arrayToString(int[] arr,String flag) {
        String str = "数组为("+flag+")：";
        str+= Arrays.toString(arr);
        return str;
    }


}
