package com.cydeo;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {

        return Stream.of(
                new Employee(100, "Mike", "mike@gmail.com", Arrays.asList("122435", "86746544")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("4122028765", "8998763425")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("5162028765", "619876")));
    }
}
