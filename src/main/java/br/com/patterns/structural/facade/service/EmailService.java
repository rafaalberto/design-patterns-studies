package br.com.patterns.structural.facade.service;

import br.com.patterns.structural.facade.model.Product;

public class EmailService {

    private final Product product;

    public EmailService(Product product) {
        this.product = product;
    }

    public void sendEmail() {
        System.out.printf("\nSending email from product code = %s, description = %s", product.getCode(), product.getDescription());
    }

}
