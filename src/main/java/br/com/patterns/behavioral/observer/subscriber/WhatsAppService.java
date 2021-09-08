package br.com.patterns.behavioral.observer.subscriber;

import br.com.patterns.behavioral.observer.publisher.NotificationService;

public class WhatsAppService implements NotificationService {
    
    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp: " + message);
    }
}
