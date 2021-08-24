package br.com.patterns.creational.abstractfactory.enumeration;

import br.com.patterns.creational.abstractfactory.factory.AbstractPaymentFactory;
import br.com.patterns.creational.abstractfactory.factory.PaymentCardFactory;
import br.com.patterns.creational.abstractfactory.factory.PaymentCashFactory;
import br.com.patterns.creational.abstractfactory.factory.PaymentTransferFactory;

public enum PaymentType {

    CREDIT(new PaymentCardFactory()),
    DEBIT(new PaymentCardFactory()),
    CASH(new PaymentCashFactory()),
    PIX(new PaymentTransferFactory());

    private final AbstractPaymentFactory factory;

    PaymentType(AbstractPaymentFactory factory) {
        this.factory = factory;
    }

    public AbstractPaymentFactory getFactory() {
        return factory;
    }
}
