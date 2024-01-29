package DesignPatternExercise.Exercise8Observer;

public class SpecificValueObserver extends Observer{


    public SpecificValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Specific Value Observer : " + subject.getState());
    }
}
