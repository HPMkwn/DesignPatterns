package Command.CarRepairExample;

public class Client {

    public static void main(String[] args) {

        FrontDeskInvoker frontDeskInvoker = new FrontDeskInvoker();

        frontDeskInvoker.setIssue(new TyrePuncture());
        frontDeskInvoker.setIssue(new EngineIssue());

        frontDeskInvoker.fixIssue();


    }
}
