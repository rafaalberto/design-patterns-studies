package br.com.patterns.creational.singleton.monostate;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        var user1 = new User();
        user1.setNames(Arrays.asList("Rafa", "Rafael", "John"));

        var user2 = new User();
        user2.setNames(Arrays.asList("Mary", "Megan"));

        System.out.println("user1: " + user1.getNames());
        System.out.println("user2: " + user2.getNames());
        System.out.println("user1 == user2: " + (user1 == user2));
        System.out.println("names1 == names2: " + (user1.getNames() == user2.getNames()));
    }

}
