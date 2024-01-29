package ConcreteDP.BehaviouralDP.Command.CarRepairExample;

public class RepairService {

    private static RepairService repairService;

    private RepairService(){}

    public static RepairService getInstance(){
        if(repairService==null)repairService = new RepairService();

        return repairService;
    }

    public void doOperation(Issue issue){
        System.out.println("Repairing the issue " + issue);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(issue + " has been repaired");
    }
}
