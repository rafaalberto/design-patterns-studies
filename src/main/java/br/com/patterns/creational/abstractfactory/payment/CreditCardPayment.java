package br.com.patterns.creational.abstractfactory.payment;

public class CreditCardPayment implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment with Credit Card");
    }
}
