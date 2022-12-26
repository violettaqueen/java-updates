package com.cydeo.genericTask;

public class OddPredicate  implements UrinaryPredicate<Integer>{


    @Override
    public boolean test(Integer obj) {
        return obj % 2 != 0;
    }
}
