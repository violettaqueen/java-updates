package com.cydeo;

import java.util.ArrayList;
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

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("MS",102)
        );

        Stream<Course> myCourseStream = myCourses.stream(); // most used

        // creating stream Values , stream is returning instance

        Stream <Integer> stream = Stream.of(1,2,3,4);







    }
}
