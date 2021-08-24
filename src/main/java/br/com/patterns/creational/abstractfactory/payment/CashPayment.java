package br.com.patterns.creational.abstractfactory.payment;

public class CashPayment implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment with Cash");
    }
}
