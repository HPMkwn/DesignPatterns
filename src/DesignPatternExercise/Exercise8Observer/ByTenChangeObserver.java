package DesignPatternExercise.Exercise8Observer;

public class ByTenChangeObserver extends Observer{

    private int previousState;
    public ByTenChangeObserver(Subject subject) {
        super(subject);
        previousState = subject.getState();
    }

    @Override
    public void update() {
        if(subject.getState() == previousState + 10)
            System.out.println("State TenChange Observer : " + subject.getState());

        previousState = subject.getState();
    }
}