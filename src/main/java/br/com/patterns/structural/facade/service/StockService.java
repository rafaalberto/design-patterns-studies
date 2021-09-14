package br.com.patterns.structural.facade.service;

import br.com.patterns.structural.facade.model.Product;

public class StockService {

    private final Product product;

    public StockService(Product product) {
        this.product = product;
    }

    public void checkStock() {
        System.out.printf("\nChecking stock product code = %s, description = %s", product.getCode(), product.getDescription());
    }

    public void writeOffStock() {
        System.out.printf("\nWriting-off stock product code = %s, description = %s", product.getCode(), product.getDescription());
    }

}
