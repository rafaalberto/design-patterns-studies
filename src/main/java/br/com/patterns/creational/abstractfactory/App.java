package br.com.patterns.creational.abstractfactory;

import br.com.patterns.creational.abstractfactory.enumeration.PaymentType;
import br.com.patterns.creational.abstractfactory.payment.PaymentService;

public class App {

    public static void main(String[] args) {
        String type = PaymentType.PIX.name();
        var paymentFactory = PaymentType.valueOf(type).getFactory();
        var paymentService = (PaymentService) paymentFactory.getService(type);
        if(paymentService != null) {
            paymentService.pay();
        }
    }

}
