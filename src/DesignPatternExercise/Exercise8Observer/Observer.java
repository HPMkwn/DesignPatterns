package DesignPatternExercise.Exercise8Observer;

public abstract class Observer {

    public Subject subject;

    public Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribeyourself(this);
    }

    public abstract void update();
}
