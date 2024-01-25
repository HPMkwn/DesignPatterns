package Observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String op : operations){
            this.listeners.put(op,new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener eventListener){
        this.listeners.get(eventType).add(eventListener);
    }

    public void unsubscribe(String eventType, EventListener eventListener){
        this.listeners.get(eventType).remove(eventListener);
    }

    public void notify(String eventType, File file){
        for(EventListener eventListener : this.listeners.get(eventType)){
            eventListener.update(eventType,file);
        }
    }
}
