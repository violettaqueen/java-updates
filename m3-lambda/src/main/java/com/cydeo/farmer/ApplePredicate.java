package com.cydeo.farmer;

@FunctionalInterface

public interface ApplePredicate {  //we are trying to pass an action to the method

    boolean test(Apple apple); // green or not, heavy or not, this method will work 2 actions
}
