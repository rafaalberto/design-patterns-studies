package br.com.patterns.behavioral.observer;

import br.com.patterns.behavioral.observer.event.EventNotificationService;
import br.com.patterns.behavioral.observer.subscriber.EmailService;
import br.com.patterns.behavioral.observer.subscriber.SMSService;
import br.com.patterns.behavioral.observer.subscriber.WhatsAppService;

public class App {

    public static void main(String[] args) {
        System.out.println("::: Observer pattern :::");

        var whatsAppService = new WhatsAppService();
        var smsService = new SMSService();
        var emailService = new EmailService();


        var service = new EventNotificationService();
        service.subscribe(whatsAppService);
        service.subscribe(smsService);
        service.subscribe(emailService);

        System.out.println("Testing after subscribe\n");

        service.notify("first message");

        service.unsubscribe(smsService);

        System.out.println("\nTesting after unsubscribe\n");

        service.notify("second message");
    }
}
