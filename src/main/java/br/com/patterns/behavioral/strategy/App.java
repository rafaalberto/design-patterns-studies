package br.com.patterns.behavioral.strategy;

import br.com.patterns.behavioral.strategy.enumeration.TransferType;
import br.com.patterns.behavioral.strategy.model.BankAccount;
import br.com.patterns.behavioral.strategy.transaction.TransferService;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        System.out.println(":: Bank account ::");
        var bankAccount = new BankAccount("Rafael", BigDecimal.valueOf(500.00));

        System.out.println(":: account name: " + bankAccount.getName());
        System.out.println(":: start balance: " + bankAccount.getBalance());

        var transferService = new TransferService(bankAccount, TransferType.DOC.getTaxService());
        transferService.doTransfer(BigDecimal.valueOf(300.00));

        System.out.println(":: final balance: " + bankAccount.getBalance());
    }

}
