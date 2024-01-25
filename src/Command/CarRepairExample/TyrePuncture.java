package Command.CarRepairExample;

public class TyrePuncture implements Issue{

    private RepairService repairService;

    private String issueName = "TyrePuncture";

    public TyrePuncture() {
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
