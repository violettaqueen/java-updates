package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

      Predicate<Integer> pred = (p) -> p%2 == 0 ? true : false;

     // Calculate sum = (x,y) -> System.out.println(x+y); // lambda assign to a variable as a value

        Calculate sum = (x,y) -> Calculator.findSum(x,y); // regular way

        // Reference to a static method:
        Calculate sum2 = Calculator :: findSum; // calling a static method
        sum2.calculate(10,20);

        // Reference to an instance method:
        Calculator obj = new Calculator();
        Calculate s3 = obj :: findMultiply;
        s3.calculate(20, 20);

        Calculate s4 = new Calculator() :: findMultiply;

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String :: substring;

        Function<Integer, Double> b = new MyClass() :: method;  // if instance method, call it through NEW obj name
        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;





    }
}
