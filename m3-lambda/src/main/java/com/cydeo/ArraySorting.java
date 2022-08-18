package com.cydeo;
import  java.lang.reflect.Array;
import  java.util.function.Predicate;

public class ArraySorting {  // QuickSort, BubbleSort // 1. create class

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting(); // create an object
        //as.sort();

        QuickSort qs = new QuickSort(); // create an object from quick sort
        BubbleSort bs = new BubbleSort(); // create an object from bubble sort

        as.sort(qs);  //java can pass different actions to one abstract method
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(() -> System.out.println("Quick Sorting"));

    }
    private void sort1(){  //create the method
        System.out.println("Quick sorting");
    }
    private void sort(Sorting sorting){  //create the method, pass a function directly
        sorting.sort();
    }
}
