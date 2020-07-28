package com.example.yccarithmetic;

import java.util.Arrays;

public class YccInsertSort {
    public static void main(String[] args) {
        int a[] = {1000,2,1,5,3,9,8,6,7,4,10,10,7};
        //int a[] = {1000,2,1,5};
        yccInsertSort(a);

    }

    private static void yccInsertSort(int[] a) {
        int[] b = new int[a.length];
        for (int i=0;i<a.length;i++){
            System.out.println("--------------------------i="+i);
            b[i]=a[i];
            int insertPos = i;
            for (int j=0;j<i;j++){
                if (b[j] >= b[insertPos]){
                    System.out.println("b"+j+"="+b[j]+"&b"+insertPos+"="+b[insertPos]);
                    insertPos = j;
                    break;
                }
            }
            if(insertPos != i){
                System.out.println("insertPos="+insertPos+",i="+i);
                System.out.println("b before insert="+Arrays.toString(b));

                for (int k=i;k>insertPos;k--){
                    b[k] = b[k-1];
                }
                b[insertPos] = a[i];
                System.out.println("b after insert="+Arrays.toString(b));
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
