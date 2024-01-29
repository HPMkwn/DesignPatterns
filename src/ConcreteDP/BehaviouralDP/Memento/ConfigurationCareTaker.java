package ConcreteDP.BehaviouralDP.Memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {

    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento){
        this.history.add((memento));
    }

    public ConfigurationMemento undo(){
        if(this.history.isEmpty())return null;

        return history.removeLast();
    }

}
