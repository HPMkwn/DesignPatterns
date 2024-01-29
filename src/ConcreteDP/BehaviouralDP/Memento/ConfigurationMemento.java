package ConcreteDP.BehaviouralDP.Memento;

public class ConfigurationMemento {

    private int height;
    private int weight;

    public ConfigurationMemento(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }


    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
