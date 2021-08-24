package br.com.patterns.creational.abstractfactory.factory;

import br.com.patterns.creational.abstractfactory.enumeration.PaymentType;
import br.com.patterns.creational.abstractfactory.payment.CashPayment;
import br.com.patterns.creational.abstractfactory.payment.PaymentService;

import java.util.Map;

public class PaymentCashFactory implements AbstractPaymentFactory<PaymentService> {

    @Override
    public PaymentService getService(String type) {
        Map<String, PaymentService> services = Map.of(
                PaymentType.CASH.name(), new CashPayment()
        );
        return services.get(type);
    }

}
