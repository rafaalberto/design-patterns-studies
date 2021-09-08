package br.com.patterns.behavioral.observer.subscriber;

import br.com.patterns.behavioral.observer.publisher.NotificationService;

public class SMSService implements NotificationService {
    
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
