package com.cydeo.farmer;

@FunctionalInterface

public interface ApplePredicate {  //we are trying to pass an action to the method

    boolean test(Apple apple);
}
