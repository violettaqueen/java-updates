package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        // list.forEach(System.out::println);

        //First, filter a stream: need to know 5-6
        // create a list
        // .stream()
        // .filter()
        System.out.println("Filter");
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        // DISTINCT
        System.out.println("Distinct"); //unique elements
        Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();
        str.forEach(System.out::println); //stream is closed

        System.out.println("Limit");

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("Skip");
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("Map");
        list.stream()
                .map(number -> number * 2)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

        List<String> words = new ArrayList<>(Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER"));

        words.stream()
                .map(String::length)
                .forEach(System.out::println);


    }
}
