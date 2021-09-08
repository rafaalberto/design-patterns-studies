package br.com.patterns.behavioral.observer.event;

import br.com.patterns.behavioral.observer.publisher.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class EventNotificationService {

    private List<NotificationService> listeners = new ArrayList<>();

    public void subscribe(NotificationService service) {
        listeners.add(service);
    }

    public void unsubscribe(NotificationService service) {
        listeners.remove(service);
    }

    public void notify(String message) {
        listeners.forEach(listener -> listener.send(message));
    }

}
