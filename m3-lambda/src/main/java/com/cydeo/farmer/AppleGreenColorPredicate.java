package com.cydeo.farmer;

public class AppleGreenColorPredicate implements ApplePredicate { // class - action

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }


}
