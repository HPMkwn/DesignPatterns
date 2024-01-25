package Command.CarRepairExample;

public class EngineIssue implements Issue{
    private RepairService repairService;

    private String issueName = "TyrePuncture";

    public EngineIssue() {
        this.repairService = RepairService.getInstance();
    }

    @Override
    public void execute() {
        this.repairService.doOperation(this);
    }

    @Override
    public String toString() {
        return issueName;
    }
}
