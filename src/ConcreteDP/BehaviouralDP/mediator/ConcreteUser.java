package ConcreteDP.BehaviouralDP.mediator;

public class ConcreteUser extends User{
    public ConcreteUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
        this.chatMediator.addUser(this);
    }

    @Override
    public void sendMessage(String message) {
        this.chatMediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this +  " : Received Message :- " + message);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

