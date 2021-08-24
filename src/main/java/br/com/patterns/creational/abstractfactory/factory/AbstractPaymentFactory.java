package br.com.patterns.creational.abstractfactory.factory;

public interface AbstractPaymentFactory<T> {

    T getService(String type);

}
