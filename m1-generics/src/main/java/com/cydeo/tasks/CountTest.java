package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
       int count = countIf(list,new OddPredicate());
        System.out.println("Number of odd integers = " + count);




    }
    private static <T> int countIf(List<T> c, UnaryPredicate<T> p){

        int count = 0;

        for (T each : c) {
            if(p.test(each)){
                count++;
            }
        }
        return count;
    }


}
