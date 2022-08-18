package com.cydeo;

import com.cydeo.farmer.Apple;
import com.cydeo.farmer.ApplePredicate;
import com.cydeo.farmer.Color;

import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() { // anonamus class , AppleHeavyPredicate clss
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        System.out.println("**********************PREDICATE******************************");
        Predicate<Integer> lesserThen = x -> x < 18; //-action/behavior, method accepts OBJECT, returnS BOOLEAN
        System.out.println(lesserThen.test(20));

        System.out.println("**********************CONSUMER******************************");
        Consumer<Integer> display = i -> System.out.println();
        display.accept(18);

        System.out.println("**********************BI CONSUMER******************************");
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(2, 4);

        System.out.println("**********************FUNCTION******************************");
        Function<String, String> fun = str -> "Hello " + str;
        System.out.println(fun.apply("World"));

        System.out.println("**********************BI FUNCTION******************************");
        BiFunction<Integer, Integer, Integer>  func = (x1,x2) -> x1 + x2;
        System.out.println(func.apply(2,5));

        System.out.println("**********************SUPPLIER******************************");
        Supplier<Double> randomValue = () -> Math.random(); // no parameter, return something
        System.out.println(randomValue.get());

    }
}
