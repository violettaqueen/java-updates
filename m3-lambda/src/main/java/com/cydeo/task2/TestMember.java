package com.cydeo.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMember {

    public static void main(String[] args) {


        Person person1 = new Person("Mike", 25, Gender.MALE, "mike@gmail.com");
        Person person2 = new Person("David", 55, Gender.MALE, "david@gmail.com");
        Person person3 = new Person("Jon", 45, Gender.MALE, "jon@gmail.com");
        Person person4 = new Person("Violetta", 25, Gender.FEMALE, "violetta@gmail.com");

        List<Person> personList = new ArrayList<>(Arrays.asList(person1, person2, person3, person4));

        CheckMember maleMember = person -> person.getGender()==Gender.MALE && person.getAge()>=18 && person.getAge()<=25;
        print(personList, maleMember); // action - behavior, implementation of test method below

    }
    private static void print(List<Person> personList, CheckMember checkMember){

        List<Person> result = new ArrayList<>();

        for (Person person : personList) {
            if(checkMember.test(person)){  // abstract methd
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
