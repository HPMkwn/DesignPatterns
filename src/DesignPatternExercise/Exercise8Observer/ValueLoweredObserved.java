package DesignPatternExercise.Exercise8Observer;

public class ValueLoweredObserved extends Observer{

    private int previousState;

    public ValueLoweredObserved(Subject subject) {
        super(subject);
        previousState = subject.getState();
    }

    @Override
    public void update() {
        if(subject.getState() > previousState)
            System.out.println("Lowered Value Observer : " + subject.getState());
        previousState = subject.getState();
    }
}
