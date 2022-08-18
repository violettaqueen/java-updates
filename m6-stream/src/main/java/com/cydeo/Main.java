package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // creating stream from Array:
        String[] courses = {"Java", "Spring", "Agile"};
        Stream<String> courseStream = Arrays.stream(courses);

        // creating stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream <String> courseStream2 = courseList.stream();



    }
}
