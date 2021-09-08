package br.com.patterns.behavioral.observer.subscriber;

import br.com.patterns.behavioral.observer.publisher.NotificationService;

public class EmailService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
