package br.com.patterns.behavioral.strategy.transaction;

import java.math.BigDecimal;

public class DocService implements TaxService {

    @Override
    public BigDecimal getTaxAmount() {
        return BigDecimal.valueOf(15.00);
    }
}
