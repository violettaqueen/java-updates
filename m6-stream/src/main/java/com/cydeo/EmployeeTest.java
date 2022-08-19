package com.cydeo;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeData.readAll()
                // .map(employee_mapping -> employee_mapping.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        // print phone numbers, but we don't need String
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        // print phone numbers separately
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        // print with double colon
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
