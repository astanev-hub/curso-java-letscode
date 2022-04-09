package com.principal;

import java.util.Arrays;

public class TestaArrays {
    public static void main(String[] args) {
        int[] arr5 = {1,2,3,4,6,77,8};
        //System.out.println(arr5);
        //int arr[] = new int[4];

        int arr[] = {77,22,33,54,56,77,999};

        arr5 = arr.clone();

        System.out.println(arr);
        System.out.println(arr5);

        //arr[4] = 1;

        for(int i = 0; i < arr.length; i++) {
            /*if(arr5[i] != 0){
                arr5[i] = arr[i];
            }*/
            System.out.println(arr[i]);
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr5));


        Arrays.sort(arr);
        Arrays.parallelSort(arr);

        System.out.println(arr.length);
        int[] copyArr = Arrays.copyOf(arr, 10);

        System.out.println(copyArr.length);

    }
}