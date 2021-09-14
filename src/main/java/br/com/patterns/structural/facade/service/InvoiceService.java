package br.com.patterns.structural.facade.service;

import br.com.patterns.structural.facade.model.Product;

public class InvoiceService {

    private final Product product;

    public InvoiceService(Product product) {
        this.product = product;
    }

    public void printInvoice() {
        System.out.printf("\nPrinting invoice for product code = %s, description = %s", product.getCode(), product.getDescription());
    }

}
