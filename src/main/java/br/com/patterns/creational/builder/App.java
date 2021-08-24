package br.com.patterns.creational.builder;

public class App {

    public static void main(String[] args) {
        Account account = new Account.Builder()
                .id(1L)
                .username("rafaalberto")
                .name("Rafael")
                .email("rafael.alberto1703@gmail.com")
                .build();
        System.out.println("Account: " + account.toString());
    }

}
