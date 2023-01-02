package com.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        // build users:
        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Brown", 45));
        users.add(new User("Tom", "Evan", 55));
        users.add(new User("Emma", "Pollard", 35));

        // Print all elements in the list: --> use Predicate
        printName(users, user -> true);  //behavior

        // Print a user which name begins from E
        printName(users, user -> user.getLastName().startsWith("E")); //behavior

    }
    private static void printName(List<User> users, Predicate<User> p){

        for (User each : users) {
           if(p.test(each)){
               System.out.println(each.toString());
           }
        }
    }
}
