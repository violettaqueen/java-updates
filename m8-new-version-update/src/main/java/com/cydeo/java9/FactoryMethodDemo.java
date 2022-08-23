package com.cydeo.java9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        // creating unmodifiable List before Java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));
        courses.add("TS");
        System.out.println(courses);

        // creating unmodifiable Set after Java9


    }
}
