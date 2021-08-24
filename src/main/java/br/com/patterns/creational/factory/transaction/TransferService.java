package br.com.patterns.creational.factory.transaction;

public class TransferService implements TransactionService {
    
    @Override
    public void execute() {
        System.out.println("::Transfer service");
    }
}
