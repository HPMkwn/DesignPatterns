package ConcreteDP.BehaviouralDP.Memento;

public class ConfigurationOriginator {

    private int height;
    private int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height,this.width);
    }

    public void restoreMemento(ConfigurationMemento configurationMemento){
        this.height = configurationMemento.getHeight();
        this.width = configurationMemento.getWeight();
    }
}
