package br.com.patterns.creational.abstractfactory.factory;

import br.com.patterns.creational.abstractfactory.enumeration.PaymentType;
import br.com.patterns.creational.abstractfactory.payment.CreditCardPayment;
import br.com.patterns.creational.abstractfactory.payment.DebitCardPayment;
import br.com.patterns.creational.abstractfactory.payment.PaymentService;

import java.util.Map;

public class PaymentCardFactory implements AbstractPaymentFactory<PaymentService> {

    @Override
    public PaymentService getService(String type) {
        Map<String, PaymentService> services = Map.of(
                PaymentType.CREDIT.name(), new CreditCardPayment(),
                PaymentType.DEBIT.name(), new DebitCardPayment()
        );
        return services.get(type);
    }

}
