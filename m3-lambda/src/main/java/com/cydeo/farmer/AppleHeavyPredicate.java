package com.cydeo.farmer;

public class AppleHeavyPredicate implements ApplePredicate{

    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
