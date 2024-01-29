package ConcreteDP.BehaviouralDP.Observer;

import java.io.File;

public class Editor {

    private EventManager events;

    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public EventManager getEvents() {
        return events;
    }

    public void saveFile(){
        if(this.file != null){
            events.notify("save", file);
        }else{
            throw new RuntimeException("Please open File First");
        }
    }
}
