package com.cydeo.genericTask;

import java.util.ArrayList;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        int count = countIf(nums, new OddPredicate());
        System.out.println("Number of odd numbers " + count);

    }

    private static <T> int countIf(List<T> list, UrinaryPredicate <T> p){

        int count = 0;
        for (T each : list) {
            if (p.test(each)) {
               count++;
            }
        }
        return count;
    }
}
