package com.cydeo.genericTask;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};
        swap(a,0,2); System.out.println(Arrays.toString(a)); //[3,2,1,4]
    }
    public static <T> void swap(T[] array, int i, int j){

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;


    }
}
