package br.com.patterns.structural.facade.facade;

import br.com.patterns.structural.facade.service.EmailService;
import br.com.patterns.structural.facade.service.InvoiceService;
import br.com.patterns.structural.facade.service.StockService;

public class ProductFacade {

    private final StockService stockService;
    private final EmailService emailService;
    private final InvoiceService invoiceService;

    public ProductFacade(StockService stockService, InvoiceService invoiceService, EmailService emailService) {
        this.stockService = stockService;
        this.invoiceService = invoiceService;
        this.emailService = emailService;
    }

    public void sellProduct() {
        this.stockService.checkStock();
        this.stockService.writeOffStock();
        this.invoiceService.printInvoice();
        this.emailService.sendEmail();
    }

}
