package com.cydeo.terminal_operators;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static com.cydeo.task.DishData.getAll;

public class FindingMatching {

    public static void main(String[] args) {

        //ALL MATCH
        System.out.println("ALL MATCH");
        boolean isHealthy = getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);
        //REAL USAGE : when we search a product there is a filter, price between 500-900, show me
        //all that match my filter

        System.out.println("ANY MATCH");
        if(getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }
        System.out.println("NON MATCH");
        boolean isHealthy2 = getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
        Optional<Dish> anyDish = getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(anyDish);


        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async)

        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        // MIN AND MAX
        System.out.println("Min");
        Optional<Dish> dMin = getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println("Max");
        Optional<Dish> dMax = getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());

        // Reduce() - to sum the numbers in a stream

        System.out.println("Dish calories total:");
        int calTotal = getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b)
                .get();

        System.out.println("COUNT");






    }


}
