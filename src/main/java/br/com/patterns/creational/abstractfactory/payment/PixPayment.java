package br.com.patterns.creational.abstractfactory.payment;

public class PixPayment implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment with PIX");
    }
}
