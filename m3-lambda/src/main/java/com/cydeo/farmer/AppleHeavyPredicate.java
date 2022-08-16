package com.cydeo.farmer;

public class AppleHeavyPredicate implements ApplePredicate{ //action class

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
