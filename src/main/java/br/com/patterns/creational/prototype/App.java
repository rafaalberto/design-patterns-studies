package br.com.patterns.creational.prototype;

public class App {

    public static void main(String[] args) {

        var item1 = new Item(1L, "Laptop", 1000.00);
        var item2 = (Item) item1.clone();
        item2.setCode(2L);

        System.out.println("item1: " + item1);
        System.out.println("item2: " + item2);
        System.out.println("item1 == item2: " + (item1 == item2));
    }

}
