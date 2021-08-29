package br.com.patterns.behavioral.strategy.transaction;

import java.math.BigDecimal;

public class PixService implements TaxService {

    @Override
    public BigDecimal getTaxAmount() {
        return BigDecimal.valueOf(0);
    }
}
