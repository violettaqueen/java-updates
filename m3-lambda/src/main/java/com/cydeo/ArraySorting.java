package com.cydeo;
import  java.lang.reflect.Array;
import  java.util.function.Predicate;

public class ArraySorting {  // QuickSort, BubbleSort // 1. create class

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting(); // create an object
        as.sort(); //

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(() -> System.out.println("Quick Sorting"));

    }
    private void sort(){  //create the method
        System.out.println("Quick Sorting array");;
    }
}
