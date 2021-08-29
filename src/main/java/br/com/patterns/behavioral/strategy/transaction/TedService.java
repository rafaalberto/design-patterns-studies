package br.com.patterns.behavioral.strategy.transaction;

import java.math.BigDecimal;

public class TedService implements TaxService {

    @Override
    public BigDecimal getTaxAmount() {
        return BigDecimal.valueOf(20.00);
    }
}
