package br.com.patterns.creational.factory.transaction;

public class WithdrawService implements TransactionService {
    
    @Override
    public void execute() {
        System.out.println("::Withdraw service");
    }
}
