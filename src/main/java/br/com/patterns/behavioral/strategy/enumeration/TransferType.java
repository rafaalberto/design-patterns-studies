package br.com.patterns.behavioral.strategy.enumeration;

import br.com.patterns.behavioral.strategy.transaction.DocService;
import br.com.patterns.behavioral.strategy.transaction.PixService;
import br.com.patterns.behavioral.strategy.transaction.TaxService;
import br.com.patterns.behavioral.strategy.transaction.TedService;

public enum TransferType {

    TED(new TedService()),
    DOC(new DocService()),
    PIX(new PixService());

    private TaxService taxService;

    TransferType(TaxService taxService) {
        this.taxService = taxService;
    }

    public TaxService getTaxService() {
        return taxService;
    }
}
