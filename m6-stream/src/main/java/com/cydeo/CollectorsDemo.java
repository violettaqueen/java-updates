package com.cydeo;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,6,7);

        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream() // set does not allow duplicates
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList() : returns a Collector Interface that gathers the input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.toList());

        //toSet() : returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2 ==0)
                .collect(Collectors.toSet());






    }
}
