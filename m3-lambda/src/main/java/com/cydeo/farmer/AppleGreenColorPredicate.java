package com.cydeo.farmer;

public class AppleGreenColorPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }


}
