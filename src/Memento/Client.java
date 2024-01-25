package Memento;

public class Client {
    public static void main(String[] args) {

        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();

        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(5,10);

        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();

        configurationCareTaker.addMemento(snapshot1);


        configurationOriginator.setHeight(10);
        configurationOriginator.setWidth(15);

        ConfigurationMemento snapshot2 = configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapshot2);

        configurationOriginator.setHeight(15);
        configurationOriginator.setWidth(20);

        ConfigurationMemento restoredMomentoObj = configurationCareTaker.undo();
        configurationOriginator.restoreMemento(restoredMomentoObj);

        System.out.println("Height : " + restoredMomentoObj.getHeight() + " : Weight " + restoredMomentoObj.getWeight());


    }
}
