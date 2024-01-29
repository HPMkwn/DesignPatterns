package ConcreteDP.BehaviouralDP.mediator;

public class Client {

    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteMediator();
        ConcreteUser user1 = new ConcreteUser(mediator,"Herat Makwana");
        ConcreteUser user2 = new ConcreteUser(mediator,"Krup Koradia");
        ConcreteUser user3 = new ConcreteUser(mediator, "OM Faldu");
        ConcreteUser user4 = new ConcreteUser(mediator,"Chelsi Koradia");
        ConcreteUser user5 = new ConcreteUser(mediator, "Janki Koradia");

        user1.sendMessage("Hello From Herat Makwana");

        user2.sendMessage("Hi Herat & EveryOne");
    }
}
