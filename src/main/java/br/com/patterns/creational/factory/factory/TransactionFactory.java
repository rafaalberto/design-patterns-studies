package br.com.patterns.creational.factory.factory;

import br.com.patterns.creational.factory.transaction.DepositService;
import br.com.patterns.creational.factory.transaction.TransactionService;
import br.com.patterns.creational.factory.transaction.TransferService;
import br.com.patterns.creational.factory.transaction.WithdrawService;

import java.util.Map;

import static br.com.patterns.creational.factory.enumeration.TransactionType.*;

public final class TransactionFactory {

    public static TransactionService getService(String type) {
        Map<String, TransactionService> services = Map.of(
                DEPOSIT.name(), new DepositService(),
                WITHDRAW.name(), new WithdrawService(),
                TRANSFER.name(), new TransferService()
        );
        return services.get(type);
    }

}
