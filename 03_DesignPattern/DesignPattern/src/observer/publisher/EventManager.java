package observer.publisher;

import observer.listeners.EventListener;

import java.io.File;
import java.util.*;

public class EventManager {
    Map<String, List<observer.listeners.EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        Arrays.stream(operations).forEach(
                operation -> this.listeners.put(operation, new ArrayList<>())
        );
    }

    public void subscribe(String eventType, observer.listeners.EventListener listener) {
        List<observer.listeners.EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, observer.listeners.EventListener listener) {
        List<observer.listeners.EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<observer.listeners.EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
