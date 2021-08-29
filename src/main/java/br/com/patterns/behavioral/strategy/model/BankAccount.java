package br.com.patterns.behavioral.strategy.model;

import java.math.BigDecimal;

public class BankAccount {

    private String name;
    private BigDecimal balance;

    public BankAccount(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
