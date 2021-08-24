package br.com.patterns.creational.singleton;

public class App {

    public static void main(String[] args) {
        var login1 = Login.getInstance();
        login1.setUser("rafael");

        var login2 = Login.getInstance();
        login2.setUser("rafa");

        System.out.println("login 1: " + login1.getUser());
        System.out.println("login 2: " + login2.getUser());
        System.out.println("login 1 == login 2: " + (login1 == login2));
        System.out.println("user 1 == user 2: " + (login1.getUser() == login2.getUser()));
    }

}
