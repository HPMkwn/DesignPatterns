package ConcreteDP.BehaviouralDP.Command.CarRepairExample;

import java.util.ArrayList;
import java.util.List;

public class FrontDeskInvoker {

    private List<Issue> issue;

    public FrontDeskInvoker(){
        issue = new ArrayList<>();
    }

    public void setIssue(Issue issue) {
        this.issue.add(issue);
    }

    public void fixIssue(){
        for (Issue i : issue){
            i.execute();
        }
    }

}
