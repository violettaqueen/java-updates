package com.cydeo.task1;

import com.cydeo.farmer.Color;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestOrange {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>(); //
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(200, Color.RED));
        inventory.add(new Orange(150, Color.GREEN));
        inventory.add(new Orange(400, Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + " g";
        prettyPrintOrange(inventory, orangeLambda);
        prettyPrintOrange(inventory, orange -> "An orange of " + orange.getWeight() + " g");

        OrangeFormatter fancyFormatter = orange -> {
            String str = orange.getWeight() > 200 ? "Heavy" : "Light";
            return "A" + str + " " + orange.getColor() + " orange";
        };
        prettyPrintOrange(inventory, fancyFormatter);
        prettyPrintOrange2(inventory, orange -> System.out.println(orange));
    }

    public static void prettyPrintOrange2(List<Orange> inventory, Consumer<Orange> c) {
        for (Orange orange : inventory) {
            c.accept(orange);
        }

    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter) {

        for (Orange orange : inventory) {
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }
}
