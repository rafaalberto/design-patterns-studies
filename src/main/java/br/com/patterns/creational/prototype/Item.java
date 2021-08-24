package br.com.patterns.creational.prototype;

public class Item implements Cloneable {

    private Long code;
    private String description;
    private Double price;

    public Item(Long code, String description, Double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected Object clone() {
        return new Item(code, description, price);
    }
}
