package br.com.patterns.creational.factory.transaction;

public class DepositService implements TransactionService {

    @Override
    public void execute() {
        System.out.println("::Deposit service");
    }
}
