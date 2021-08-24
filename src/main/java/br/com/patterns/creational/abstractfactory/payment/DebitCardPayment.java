package br.com.patterns.creational.abstractfactory.payment;

public class DebitCardPayment implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment with Debit Card");
    }
}
