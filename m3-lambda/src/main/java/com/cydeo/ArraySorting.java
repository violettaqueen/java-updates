package com.cydeo;
import  java.lang.reflect.Array;
import  java.util.function.Predicate;

public class ArraySorting {  // QuickSort, BubbleSort

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(() -> System.out.println("Quick Sorting"));

    }
    private void sort(Sorting sorting){
        sorting.sort();
    }
}
