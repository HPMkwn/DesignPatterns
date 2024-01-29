package ConcreteDP.BehaviouralDP.Observer;

import java.io.File;

public class SMSNotificationListener implements EventListener{

    private String number;

    public SMSNotificationListener(String number) {
        this.number = number;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Sending Email to "+ number + "Someone has performed " + eventType + "operation with the following file: "+ file.getName());
    }
}
