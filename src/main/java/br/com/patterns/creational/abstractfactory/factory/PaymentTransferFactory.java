package br.com.patterns.creational.abstractfactory.factory;

import br.com.patterns.creational.abstractfactory.enumeration.PaymentType;
import br.com.patterns.creational.abstractfactory.payment.PaymentService;
import br.com.patterns.creational.abstractfactory.payment.PixPayment;

import java.util.Map;

public class PaymentTransferFactory implements AbstractPaymentFactory<PaymentService> {

    @Override
    public PaymentService getService(String type) {
        Map<String, PaymentService> services = Map.of(
                PaymentType.PIX.name(), new PixPayment()
        );
        return services.get(type);
    }

}
