package br.com.patterns.structural.facade.model;

public class Product {

    private final String code;
    private final String description;

    public Product(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
