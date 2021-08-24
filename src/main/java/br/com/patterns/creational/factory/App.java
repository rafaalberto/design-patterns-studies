package br.com.patterns.creational.factory;

import br.com.patterns.creational.factory.enumeration.TransactionType;
import br.com.patterns.creational.factory.factory.TransactionFactory;

public class App {

    public static void main(String[] args) {
        var type = TransactionType.DEPOSIT.name();
        var transaction = TransactionFactory.getService(type);
        transaction.execute();
    }

}
