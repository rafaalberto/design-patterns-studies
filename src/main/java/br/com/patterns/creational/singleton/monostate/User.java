package br.com.patterns.creational.singleton.monostate;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static List<String> names = new ArrayList<>();

    public static List<String> getNames() {
        return names;
    }

    public static void setNames(List<String> namesList) {
        names.addAll(namesList);
    }

}
