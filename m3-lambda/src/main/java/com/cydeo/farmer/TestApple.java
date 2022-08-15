package com.cydeo.farmer;

import java.util.ArrayList;
import java.util.List;

public class TestApple {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>(); //
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(200, Color.RED));
        inventory.add(new Apple(150, Color.GREEN));
        inventory.add(new Apple(400, Color.RED));

        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

        ApplePredicate weightApple = (apple) -> apple.getWeight() > 200;
        filterApples(inventory, weightApple);


    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) { // interface
        // get all apples from inventory  // polymorphism

        List<Apple> result = new ArrayList<Apple>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
