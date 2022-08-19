package com.cydeo.task;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DishTask {

    public static void main(String[] args) {

        // print all dish names that has less than 400 cal

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 400)
                .map(Dish::getName) //.map(dish -> dish.getName())
                .forEach(System.out::println);

        // print the length of the name of each dish

        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(x -> System.out.print(x + " ")); // x - each length number for each word

        System.out.println();

        // print three high caloric dish name(>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        // print all dish name that are below 400 calories in sorted
        Collections.sort(DishData.getAll());
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(dish -> dish.getCalories()))
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
