package br.com.patterns.structural.facade;

import br.com.patterns.structural.facade.facade.ProductFacade;
import br.com.patterns.structural.facade.model.Product;
import br.com.patterns.structural.facade.service.EmailService;
import br.com.patterns.structural.facade.service.InvoiceService;
import br.com.patterns.structural.facade.service.StockService;

public class App {

    public static void main(String[] args) {
        System.out.println(":: Facade App");

        var product = new Product("1", "Laptop");

        var stockService = new StockService(product);
        var invoiceService = new InvoiceService(product);
        var emailService = new EmailService(product);

        var productFacade = new ProductFacade(stockService, invoiceService, emailService);
        productFacade.sellProduct();
    }

}
