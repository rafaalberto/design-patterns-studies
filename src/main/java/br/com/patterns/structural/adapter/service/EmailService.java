package br.com.patterns.structural.adapter.service;

public class EmailService implements NotificationService {

    @Override
    public void sendMessage(String title, String message) {
        System.out.println("sending " + title + " with message: " + message);
    }

}
