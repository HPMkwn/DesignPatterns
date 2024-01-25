package Observer;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.getEvents().subscribe("open", new SMSNotificationListener("7874570617"));
        editor.getEvents().subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
