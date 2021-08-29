package br.com.patterns.behavioral.strategy.transaction;

import br.com.patterns.behavioral.strategy.model.BankAccount;

import java.math.BigDecimal;

public class TransferService {

    private final BankAccount bankAccount;
    private final TaxService taxService;

    public TransferService(BankAccount bankAccount, TaxService taxService) {
        this.bankAccount = bankAccount;
        this.taxService = taxService;
    }

    public void doTransfer(BigDecimal amount) {
        var tax = taxService.getTaxAmount();
        var balance = bankAccount.getBalance().subtract(amount).subtract(tax);
        bankAccount.setBalance(balance);
    }

}
