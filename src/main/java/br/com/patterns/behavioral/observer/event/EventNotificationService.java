package br.com.patterns.behavioral.observer.event;

import br.com.patterns.behavioral.observer.publisher.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class EventNotificationService {

    private final List<NotificationService> notificationServices = new ArrayList<>();

    public void subscribe(NotificationService service) {
        notificationServices.add(service);
    }

    public void unsubscribe(NotificationService service) {
        notificationServices.remove(service);
    }

    public void notify(String message) {
        notificationServices.forEach(listener -> listener.send(message));
    }

}
